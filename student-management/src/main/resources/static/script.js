const API_URL = 'http://localhost:8080/api/students';

document.addEventListener('DOMContentLoaded', () => {
    fetchStudents();
    document.getElementById('student-form').addEventListener('submit', handleFormSubmit);
});

async function fetchStudents() {
    try {
        const response = await fetch(API_URL);
        const students = await response.json();
        renderStudents(students);
    } catch (error) {
        console.error('Error fetching students:', error);
    }
}

function renderStudents(students) {
    const studentList = document.getElementById('student-list');
    studentList.innerHTML = '';

    if (students.length === 0) {
        studentList.innerHTML = `<tr><td colspan="4" style="text-align: center; color: var(--text-muted)">No students found.</td></tr>`;
        return;
    }

    students.forEach(student => {
        const tr = document.createElement('tr');
        tr.innerHTML = `
            <td>${escapeHTML(student.name)}</td>
            <td>${escapeHTML(student.email)}</td>
            <td>${escapeHTML(student.course)}</td>
            <td class="action-btns">
                <button class="btn-icon btn-edit" onclick="editStudent(${student.id}, '${escapeQuote(student.name)}', '${escapeQuote(student.email)}', '${escapeQuote(student.course)}')">Edit</button>
                <button class="btn-icon btn-delete" onclick="deleteStudent(${student.id})">Delete</button>
            </td>
        `;
        studentList.appendChild(tr);
    });
}

async function handleFormSubmit(e) {
    e.preventDefault();

    const id = document.getElementById('student-id').value;
    const studentData = {
        name: document.getElementById('name').value,
        email: document.getElementById('email').value,
        course: document.getElementById('course').value
    };

    try {
        let response;
        if (id) {
            // Update existing student
            response = await fetch(`${API_URL}/${id}`, {
                method: 'PUT',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(studentData)
            });
        } else {
            // Add new student
            response = await fetch(API_URL, {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(studentData)
            });
        }

        if (response.ok) {
            resetForm();
            fetchStudents();
        } else {
            console.error('Failed to save student');
        }
    } catch (error) {
        console.error('Error saving student:', error);
    }
}

function editStudent(id, name, email, course) {
    document.getElementById('student-id').value = id;
    document.getElementById('name').value = name;
    document.getElementById('email').value = email;
    document.getElementById('course').value = course;

    document.getElementById('form-title').innerText = 'Edit Student';
    document.getElementById('btn-submit').innerText = 'Update Student';
    document.getElementById('btn-cancel').style.display = 'block';
}

async function deleteStudent(id) {
    if (confirm('Are you sure you want to delete this student?')) {
        try {
            const response = await fetch(`${API_URL}/${id}`, {
                method: 'DELETE'
            });
            if (response.ok) {
                fetchStudents();
            } else {
                console.error('Failed to delete student');
            }
        } catch (error) {
            console.error('Error deleting student:', error);
        }
    }
}

function resetForm() {
    document.getElementById('student-form').reset();
    document.getElementById('student-id').value = '';
    document.getElementById('form-title').innerText = 'Add New Student';
    document.getElementById('btn-submit').innerText = 'Add Student';
    document.getElementById('btn-cancel').style.display = 'none';
}

function escapeHTML(str) {
    const div = document.createElement('div');
    div.innerText = str;
    return div.innerHTML;
}

function escapeQuote(str) {
    return str.replace(/'/g, "\\'");
}
