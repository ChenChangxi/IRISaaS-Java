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
    <script type="text/javascript" src="javascript/paper.js"></script>
    <script type="text/javascript" src="javascript/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#tab").on("click", ":radio", function(event){
                $("#P_Ano").val($(this).closest("tr").find("td").eq(0).text());
                $("#P_Aname").val($(this).closest("tr").find("td").eq(1).text());
                $("#P_Amajor").val($(this).closest("tr").find("td").eq(2).text());
                $("#P_Atime").val($(this).closest("tr").find("td").eq(3).text());
                $("#P_Apublic").val($(this).closest("tr").find("td").eq(4).text());
                $("#P_Aquote").val($(this).closest("tr").find("td").eq(5).text());
            });
        });
    </script>

    <script type="text/javascript">

        function use() {

            document.getElementById("request").value="select";

            switch(true) {

                case ${flag=='paper'} :document.PA_form.action="/paper";break;
                case ${flag=='paa'} :document.PA_form.action="/paa"; break;
                case ${flag=='pas'} :document.PA_form.action="/pas"; break;
            }
            document.PA_form.submit();
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
    <form name="PA_form" method="post">
        <table border="1" bordercolor="gold" bgcolor="#fff0f5" width="700"
               style="font-size:12px;align:left;" cellpadding="4" id="tab">
            <tr>
                <td height="60" colspan="8"><br>
                    <span style="color:green;font-size:20px">
                    <b><center>您现在在科技论文管理页面</center></b>
                </span>
                </td>
            </tr>
            <input type="hidden" name="request" id="request">
            <input type="hidden" name="index" id="index" value="${index}">
            <c:choose>
                <c:when test="${requestScope.flag=='paper'}">
                    <%@ include file="pages/self.jsp" %>
                </c:when>

                <c:when test="${requestScope.flag=='pas'}">
                    <%@ include file="pages/pa_s.jsp" %>
                </c:when>

                <c:when test="${requestScope.flag=='paa'}">
                    <%@ include file="pages/pa_a.jsp" %>
                </c:when>
            </c:choose>
        </table><br>
        <input type="hidden" name="P_Ano_t" id="P_Ano_t" value="${P_Ano_t}">
        <input type="hidden" name="P_Aname_t" id="P_Aname_t" value="${P_Aname_t}">
        <input type="hidden" name="P_Amajor_t" id="P_Amajor_t" value="${P_Amajor_t}">
        <input type="hidden" name="P_Atime_t" id="P_Atime_t" value="${P_Atime_t}">
        <input type="hidden" name="P_Apublic_t" id="P_Apublic_t" value="${P_Apublic_t}">
        <input type="hidden" name="P_Aquote_t" id="P_Aquote_t" value="${P_Aquote_t}">
    </form>
</div>
</body>
</html>
