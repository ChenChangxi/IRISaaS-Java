<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="javascript/program.js"></script>
    <script type="text/javascript" src="javascript/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#tab").on("click", ":radio", function(event){
                $("#Pno").val($(this).closest("tr").find("td").eq(0).text());
                $("#Pname").val($(this).closest("tr").find("td").eq(1).text());
                $("#Plevel").val($(this).closest("tr").find("td").eq(2).text());
                $("#Ptype").val($(this).closest("tr").find("td").eq(3).text());
                $("#Pmajor").val($(this).closest("tr").find("td").eq(4).text());
                $("#Pinfo_start").val($(this).closest("tr").find("td").eq(5).text());
                $("#Pinfo_end").val($(this).closest("tr").find("td").eq(6).text());
                $("#Pinfo_corporate").val($(this).closest("tr").find("td").eq(7).text());
            });
        });
    </script>
    <script type="text/javascript">

        function use() {

            document.getElementById("request").value="select";

            switch(true) {

                case ${flag=='program'} :document.P_form.action="/program";break;
                case ${flag=='ps'} :document.P_form.action="/ps"; break;
            }
            document.P_form.submit();
        }

        function next() {

            var index=document.getElementById("index").value;
            if(index<${page}) document.getElementById("index").value++;
            use();
        }

        function pre() {

            var index=document.getElementById("index").value;
            if(index>1) document.getElementById("index").value--;
            use();
        }
    </script>
</head>
<body background="imags/flower.jpg">
<div align="center">
    <form name="P_form" method="post">
        <table border="1" bordercolor="gold" bgcolor="#fff0f5" width="700"
               style="font-size:12px;align:left;" cellpadding="4" id="tab">
            <tr>
                <td height="60" colspan="10"><br>
                    <span style="color:green;font-size:20px">
                    <b><center>您现在在科技项目管理页面</center></b>
                </span>
                </td>
            </tr>
            <input type="hidden" name="request" id="request">
            <input type="hidden" name="index" id="index" value="${index}">
            <c:choose>
                <c:when test="${requestScope.flag=='program'}">
                    <%@ include file="pages/self.jsp" %>
                </c:when>
                <c:when test="${requestScope.flag=='ps'}">
                    <%@ include file="pages/p_s.jsp" %>
                </c:when>
            </c:choose>
        </table><br>
        <input type="hidden" name="Pno_t" id="Pno_t" value="${Pno_t}">
        <input type="hidden" name="Pname_t" id="Pname_t" value="${Pname_t}">
        <input type="hidden" name="Pmajor_t" id="Pmajor_t" value="${Pmajor_t}">
        <input type="hidden" name="Plevel_t" id="Plevel_t" value="${Plevel_t}">
        <input type="hidden" name="Ptype_t" id="Ptype_t" value="${Ptype_t}">
        <input type="hidden" name="Pinfo_start_t" id="Pinfo_start_t" value="${Pinfo_start_t}">
        <input type="hidden" name="Pinfo_end_t" id="Pinfo_end_t" value="${Pinfo_end_t}">
        <input type="hidden" name="Pinfo_corporate_t" id="Pinfo_corporate_t" value="${Pinfo_corporate_t}">
    </form>
</div>
</body>
</html>
