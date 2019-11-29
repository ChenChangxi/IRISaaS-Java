function ps_insert() {

    document.getElementById("request").value="insert";
    document.P_form.action="/ps";
    document.P_form.submit();

}

function ps_delete() {

    document.getElementById("request").value="delete";
    document.P_form.action="/ps";
    document.P_form.submit();
}


////////////////////////////////////////////////////////////////


function s_select() {

    document.getElementById("index").value=null;
    document.getElementById("request").value="select";
    document.P_form.action="/sp";
    document.P_form.submit();
}


////////////////////////////////////////////////////////////////


function clearAll() {

    document.getElementById("Pname").value="";
    document.getElementById("Plevel").value="";
    document.getElementById("Ptype").value="";
    document.getElementById("Pmajor").value="";
    document.getElementById("Pinfo_start").value="";
    document.getElementById("Pinfo_end").value="";
    document.getElementById("Pinfo_corporate").value="";
}

function clearPno() {

    document.getElementById("Pno").value="";
}


////////////////////////////////////////////////////////////////


function p_update() {

    document.getElementById("request").value="update";
    document.P_form.action="/program";
    document.P_form.submit();
}

function p_delete() {

    document.getElementById("request").value="delete";
    document.P_form.action="/program";
    document.P_form.submit();
}


////////////////////////////////////////////////////////////////





