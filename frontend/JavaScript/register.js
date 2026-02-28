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

    let phone = document.getElementById("phone").value;
    let pattern = /^[0-9]+$/;
    if(phone == "" || !phone.match(pattern)){
        alert("phone number should not be empty and contains only integers");
        return false;
    }
    console.log(phone);

    let age = document.getElementById('age').value;
    if(age < 0 || !age.match(pattern)){
        alert("Enter the correct age");
        return false;
    }
    console.log(age);
    return false;


}