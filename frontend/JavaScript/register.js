function validateForm(){
    let fname = document.getElementById("fname").value;
    if(fname == ""){
        alert("Please fill the First Name");
        return false;
    }
    console.log(fname);
    
    let secname = document.getElementById("lname").value;
    if(secname == ""){
        alert("please fill the Second Name");
        return false;
    }
    console.log(secname);
// 91012a8876
    let phone = document.getElementById("phone").value;
    let pattern = /^[0-9]+$/;
    if(phone == "" || !phone.match(pattern)){
        alert("phone number should not be empty and contains only integers");
        return false;
    }
    console.log(phone);

    let age = document.getElementById('age').value;
    if(age < 1 || age == ""){
        alert("Enter the correct age");
        return false;
    }
    console.log(age);

    let subjects = document.getElementsByName("subjects");
    let selectedSubject = false;
    for(let i=0; i<subjects.length; i++){
        if(subjects[i].checked){
            selectedSubject = true;
            break;
        }
    }
    if(selectedSubject == false){
        alert("select atleast one subject");
        return false;
    }

    let location = document.getElementById("location").value;
    if(location == ""){
        alert("Enter the location");
        return false;
    }
    console.log(location);

    alert("form submitted succesfully")
    return false;
}