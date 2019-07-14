<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="javascript/achievement.js"></script>
    <script type="text/javascript" src="javascript/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#tab").on("click", ":radio", function(event){
                $("#Ano").val($(this).closest("tr").find("td").eq(0).text());
                $("#Aname").val($(this).closest("tr").find("td").eq(1).text());
                $("#Aidentify").val($(this).closest("tr").find("td").eq(2).text());
                $("#Aaward").val($(this).closest("tr").find("td").eq(3).text());
                $("#Atransform").val($(this).closest("tr").find("td").eq(4).text());
                $("#Apatent").val($(this).closest("tr").find("td").eq(5).text());
            });
        });
    </script>

    <script type="text/javascript">

        function use() {

            document.getElementById("request").value="select";

            switch(true) {

                case ${flag=='achievement'} :document.A_form.action="/achievement";break;
                case ${flag=='apa'} :document.A_form.action="/apa"; break;
                case ${flag=='as'} :document.A_form.action="/as"; break;
            }
            document.A_form.submit();
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
    <form name="A_form" method="post">
        <table border="1" bordercolor="gold" bgcolor="#fff0f5" width="700"
               style="font-size:12px;align:left;" cellpadding="4" id="tab" name="tab">
            <tr>
                <td height="60" colspan="8"><br>
                    <span style="color:green;font-size:20px">
                    <b><center>您现在在科技成果管理页面</center></b>
                </span>
                </td>
            </tr>
            <input type="hidden" name="request" id="request" value="">
            <input type="hidden" name="index" id="index" value="${index}">
            <c:choose>
                <c:when test="${requestScope.flag=='achievement'}">
                    <%@ include file="pages/self.jsp" %>
                </c:when>

                <c:when test="${requestScope.flag=='as'}">
                    <%@ include file="pages/a_s.jsp" %>
                </c:when>

                <c:when test="${requestScope.flag=='apa'}">
                    <%@ include file="pages/a_pa.jsp" %>
                </c:when>
            </c:choose>
        </table><br>
        <input type="hidden" name="Ano_t" id="Ano_t" value="${Ano_t}">
        <input type="hidden" name="Aname_t" id="Aname_t" value="${Aname_t}">
        <input type="hidden" name="Aidentify_t" id="Aidentify_t" value="${Aidentify_t}">
        <input type="hidden" name="Aaward_t" id="Aaward_t" value="${Aaward_t}">
        <input type="hidden" name="Atransform_t" id="Atransform_t" value="${Atransform_t}">
        <input type="hidden" name="Apatent_t" id="Apatent_t" value="${Apatent_t}">
    </form>
</div>
</body>
</html>
