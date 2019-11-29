<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<tr>
    <td colspan="1">成果名</td>
    <%@ include file="modules/head.jsp" %>
</tr>

<tr>
    <td rowspan="11" height="10" align="center">${Aname}</td>
    <%@ include file="modules/table.jsp" %>
</tr>

<%@ include file="modules/Menu/pa_aMenu.jsp" %>