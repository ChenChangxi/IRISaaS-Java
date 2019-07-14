function cs_insert() {

    document.getElementById("request").value="insert";
    document.A_form.action="/cs";
    document.A_form.submit();

}

function cs_delete() {

    document.getElementById("request").value="delete";
    document.A_form.action="/cs";
    document.A_form.submit();
}


////////////////////////////////////////////////////////////////


function s_select() {

    document.getElementById("index").value=null;
    document.getElementById("request").value="select";
    document.C_form.action="/sc";
    document.C_form.submit();
}


////////////////////////////////////////////////////////////////


function clearAll() {

    document.getElementById("Cname").value="";
    document.getElementById("Cmajor").value="";
    document.getElementById("Ctype").value="";
    document.getElementById("Ctime").value="";
    document.getElementById("Cquote").value="";
}

function clearCno() {

    document.getElementById("Cno").value="";
}


////////////////////////////////////////////////////////////////


function c_update() {

    document.getElementById("request").value="update";
    document.C_form.action="/copyright";
    document.C_form.submit();
}

function c_delete() {

    document.getElementById("request").value="delete";
    document.C_form.action="/copyright";
    document.C_form.submit();
}


////////////////////////////////////////////////////////////////








