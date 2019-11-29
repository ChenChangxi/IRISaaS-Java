function apa_insert() {

    document.getElementById("request").value="insert";
    document.A_form.action="/apa";
    document.A_form.submit();

}

function apa_delete() {

    document.getElementById("request").value="delete";
    document.A_form.action="/apa";
    document.A_form.submit();
}


////////////////////////////////////////////////////////////////////


function as_insert() {

    document.getElementById("request").value="insert";
    document.A_form.action="/as";
    document.A_form.submit();

}

function as_delete() {

    document.getElementById("request").value="delete";
    document.A_form.action="/as";
    document.A_form.submit();
}


////////////////////////////////////////////////////////////////////


function s_select() {

    document.getElementById("index").value=null;
    document.getElementById("request").value="select";
    document.A_form.action="/sa";
    document.submit();
}

function pa_select() {

    document.getElementById("index").value=null;
    document.getElementById("request").value="select";
    document.A_form.action="/paa";
    document.submit();
}


////////////////////////////////////////////////////////////////////


function clearAll() {

    document.getElementById("Aname").value="";
    document.getElementById("Aidentify").value="";
    document.getElementById("Aaward").value="";
    document.getElementById("Atransform").value="";
    document.getElementById("Apatent").value="";
}

function clearAno() {

    document.getElementById("Ano").value="";
}


////////////////////////////////////////////////////////////////////


function a_update() {

    document.getElementById("request").value="update";
    document.A_form.action="/achievement";
    document.A_form.submit();
}

function a_delete() {

    document.getElementById("request").value="delete";
    document.A_form.action="/achievement";
    document.A_form.submit();
}


////////////////////////////////////////////////////////////////////
