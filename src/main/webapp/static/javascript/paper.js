function paa_insert() {

    document.getElementById("request").value="insert";
    document.PA_form.action="/paa";
    document.PA_form.submit();

}

function paa_delete() {

    document.getElementById("request").value="delete";
    document.PA_form.action="/paa";
    document.PA_form.submit();
}


/////////////////////////////////////////////////////////////////


function pas_insert() {

    document.getElementById("request").value="insert";
    document.PA_form.action="/pas";
    document.PA_form.submit();

}

function pas_delete() {

    document.getElementById("request").value="delete";
    document.PA_form.action="/pas";
    document.PA_form.submit();
}


/////////////////////////////////////////////////////////////////


function s_select() {

    document.getElementById("index").value=null;
    document.getElementById("request").value="select";
    document.PA_form.action="/spa";
    document.PA_form.submit();
}

function a_select() {

    document.getElementById("index").value=null;
    document.getElementById("request").value="select";
    document.PA_form.action="/apa";
    document.PA_form.submit();
}


/////////////////////////////////////////////////////////////////


function clearAll() {

    document.getElementById("P_Aname").value="";
    document.getElementById("P_Amajor").value="";
    document.getElementById("P_Atime").value="";
    document.getElementById("P_Apublic").value="";
    document.getElementById("P_Aquote").value="";
}

function clearPano() {

    document.getElementById("P_Ano").value="";
}


/////////////////////////////////////////////////////////////////


function pa_update() {

    document.getElementById("request").value="update";
    document.PA_form.action="/paper";
    document.PA_form.submit();
}

function pa_delete() {

    document.getElementById("request").value="delete";
    document.PA_form.action="/paper";
    document.PA_form.submit();
}


/////////////////////////////////////////////////////////////////


function next() {


}

function pre() {


}
