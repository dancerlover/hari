function validate()
{
    var f=form.fname.value;
    var g=form.pno.value;
    let valid=true;
    var n=form.npass.value;
    var h=form.cpass.value;
    if((f.match(/^[a-zA-z]/))&&(g.match(/^[0-9]{10}/))&&(n==h))
    {
        valid=true;
        
        console.log(valid);
       alert("thank u");

    }
    else{
        valid=false;
        console.log(valid);
        alert("please fill it");
    }
    

}

