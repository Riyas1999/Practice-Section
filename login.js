function validate()
{
    var username=document.getElementById("username").value;
    var password=document.getElementById("Password").value;
    if(username=="admin"&& password=="user")
    {
        alert("login succesfully");
        return false;
    }
    else{
        alert("login failed");
    }
}