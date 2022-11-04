function val()
{
   var a=document.getElementById("name").value;
   if( a.match(/[a-z]/i)){
        //console.log("true");
        alert("ur data was saved");
   }else{
    //console.log("false");
    alert("please fill..");
   }

}

