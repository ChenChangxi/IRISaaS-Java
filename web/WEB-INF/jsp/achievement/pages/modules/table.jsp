<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:forEach items="${alist}" var="p">
    <tr>
        <td colspan="1" height="10">${p.no}</td>
        <td colspan="1" height="10">${p.name}</td>
        <td colspan="1" height="10">${p.identify}</td>
        <td colspan="1" height="10">${p.award}</td>
        <td colspan="1" height="10">${p.transform}</td>
        <td colspan="1" height="10">${p.patent}</td>
        <td colspan="1" height="10"><input type="radio" name="choose"></td>
    </tr>
</c:forEach>
