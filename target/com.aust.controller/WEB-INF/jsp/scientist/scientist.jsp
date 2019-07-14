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
    <script type="text/javascript" src="javascript/scientist.js"></script>
    <script type="text/javascript" src="javascript/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#tab").on("click", ":radio", function(event){
                $("#Sno").val($(this).closest("tr").find("td").eq(0).text());
                $("#Sname").val($(this).closest("tr").find("td").eq(1).text());
                $("#Sage").val($(this).closest("tr").find("td").eq(2).text());
                $("#Ssex").val($(this).closest("tr").find("td").eq(3).text());
                $("#Sdept").val($(this).closest("tr").find("td").eq(4).text());
                $("#Spro").val($(this).closest("tr").find("td").eq(5).text());
                $("#Smaj").val($(this).closest("tr").find("td").eq(6).text());
            });
        });
    </script>
    <script type="text/javascript">

        function use() {

            document.getElementById("request").value="select";

            switch(true) {

                case ${flag=='scientist'} :document.S_form.action="/scientist";break;
                case ${flag=='sa'} :document.S_form.action="/sa"; break;
                case ${flag=='sc'} :document.S_form.action="/sc"; break;
                case ${flag=='sp'} :document.S_form.action="/sp"; break;
                case ${flag=='spa'} :document.S_form.action="/spa"; break;
            }
            document.S_form.submit();
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
    <form name="S_form" method="post">
        <table border="1" bordercolor="gold" bgcolor="#fff0f5" width="700"
               style="font-size:12px;align:left;" cellpadding="4" id="tab">
            <tr>
                <td height="60" colspan="9"><br>
                    <span style="color:green;font-size:20px">
                    <b><center>您现在在科技人员管理页面</center></b>
                </span>
                </td>
            </tr>
            <input type="hidden" name="request" id="request">
            <input type="hidden" name="index" id="index" value="${index}">
            <c:choose>
                <c:when test="${flag == 'scientist'}">
                    <%@ include file="pages/self.jsp" %>
                </c:when>
                <c:when test="${flag == 'sa'}">
                    <%@ include file="pages/s_a.jsp" %>
                </c:when>
                <c:when test="${flag == 'sc'}">
                    <%@ include file="pages/s_c.jsp" %>
                </c:when>
                <c:when test="${flag == 'spa'}">
                    <%@ include file="pages/s_pa.jsp" %>
                </c:when>
                <c:when test="${flag == 'sp'}">
                    <%@ include file="pages/s_p.jsp" %>
                </c:when>
            </c:choose>
            <input type="hidden" name="Sno_t" id="Sno_t" value="${Sno_t}">
            <input type="hidden" name="Sname_t" id="Sname_t" value="${Sname_t}">
            <input type="hidden" name="Sage_t" id="Sage_t" value="${Sage_t}">
            <input type="hidden" name="Sdept_t" id="Sdept_t" value="${Sdept_t}">
            <input type="hidden" name="Spro_t" id="Spro_t" value="${Spro_t}">
            <input type="hidden" name="Ssex_t" id="Ssex_t" value="${Ssex_t}">
            <input type="hidden" name="Smaj_t" id="Smaj_t" value="${Smaj_t}">
        </table><br>
    </form>
</div>
</body>
</html>
