<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="javascript/copyright.js"></script>
    <script type="text/javascript" src="javascript/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#tab").on("click", ":radio", function(event){
                $("#Cno").val($(this).closest("tr").find("td").eq(0).text());
                $("#Cname").val($(this).closest("tr").find("td").eq(1).text());
                $("#Cmajor").val($(this).closest("tr").find("td").eq(2).text());
                $("#Ctype").val($(this).closest("tr").find("td").eq(3).text());
                $("#Ctime").val($(this).closest("tr").find("td").eq(4).text());
                $("#Cquote").val($(this).closest("tr").find("td").eq(5).text());
            });
        });
    </script>
    <script type="text/javascript">

        function use() {

            document.getElementById("request").value="select";

            switch(true) {

                case ${flag=='copyright'} :document.C_form.action="/copyright";break;
                case ${flag=='cs'} :document.C_form.action="/cs"; break;
            }
            document.C_form.submit();
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
    <form name="C_form" method="post">
        <table border="1" bordercolor="gold" bgcolor="#fff0f5" width="700"
               style="font-size:12px;align:left;" cellpadding="4" id="tab">
            <tr>
                <td height="60" colspan="8"><br>
                    <span style="color:green;font-size:20px">
                    <b><center>您现在在科技著作管理页面</center></b>
                </span>
                </td>
            </tr>
            <input type="hidden" name="request" id="request">
            <input type="hidden" name="index" id="index" value="${index}">
            <c:choose>
                <c:when test="${requestScope.flag=='copyright'}">
                    <%@ include file="pages/self.jsp" %>
                </c:when>

                <c:when test="${requestScope.flag=='cs'}">
                    <%@ include file="pages/c_s.jsp" %>
                </c:when>
            </c:choose>
        </table><br>
        <input type="hidden" name="Cno_t" id="Cno_t" value="${Cno_t}">
        <input type="hidden" name="Cname_t" id="Cname_t" value="${Cname_t}">
        <input type="hidden" name="Cmajor_t" id="Cmajor_t" value="${Cmajor_t}">
        <input type="hidden" name="Ctype_t" id="Ctype_t" value="${Ctype_t}">
        <input type="hidden" name="Ctime_t" id="Ctime_t" value="${Ctime_t}">
        <input type="hidden" name="Cquote_t" id="Cquote_t" value="${Cquote_t}">
    </form>
</div>
</body>
</html>
