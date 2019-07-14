function sa_insert() {

    document.getElementById("request").value="insert";
    document.S_form.action="/sa";
    document.S_form.submit();

}

function sa_delete() {

    document.getElementById("request").value="delete";
    document.S_form.action="/sa";
    document.S_form.submit();
}


////////////////////////////////////////////////////////////////


function sc_insert() {

    document.getElementById("request").value="insert";
    document.S_form.action="/sc";
    document.S_form.submit();

}

function sc_delete() {

    document.getElementById("request").value="delete";
    document.S_form.action="/sc";
    document.S_form.submit();
}


////////////////////////////////////////////////////////////////


function spa_insert() {

    document.getElementById("request").value="insert";
    document.S_form.action="/spa";
    document.S_form.submit();

}

function spa_delete() {

    document.getElementById("request").value="delete";
    document.S_form.action="/spa";
    document.S_form.submit();
}


////////////////////////////////////////////////////////////////


function sp_insert() {

    document.getElementById("request").value="insert";
    document.S_form.action="/sp";
    document.S_form.submit();

}

function sp_delete() {

    document.getElementById("request").value="delete";
    document.S_form.action="/sp";
    document.S_form.submit();
}


////////////////////////////////////////////////////////////////


function p_select() {

    document.getElementById("index").value=null;
    document.getElementById("request").value="select";
    document.S_form.action="/ps";
    document.S_form.submit();
}


function pa_select() {

    document.getElementById("index").value=null;
    document.getElementById("request").value="select";
    document.S_form.action="/pas";
    document.S_form.submit();
}

function a_select() {

    document.getElementById("index").value=null;
    document.getElementById("request").value="select";
    document.S_form.action="/as";
    document.S_form.submit();
}

function c_select() {

    document.getElementById("index").value=null;
    document.getElementById("request").value="select";
    document.S_form.action="/cs";
    document.S_form.submit();
}


////////////////////////////////////////////////////////////////


function clearAll() {

    document.getElementById("Sname").value="";
    document.getElementById("Sage").value="";
    document.getElementById("Ssex").value="";
    document.getElementById("Sdept").value="";
    document.getElementById("Spro").value="";
    document.getElementById("Smaj").value="";
}

function clearSno() {

    document.getElementById("Sno").value="";
}

////////////////////////////////////////////////////////////////


function s_update() {

    document.getElementById("request").value="update";
    document.S_form.action="/scientist";
    document.S_form.submit();
}

function s_delete() {

    document.getElementById("request").value="delete";
    document.S_form.action="/scientist";
    document.S_form.submit();
}


////////////////////////////////////////////////////////////////



