<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:forEach items="${slist}" var="p">
    <tr>
        <td colspan="1" height="10">${p.no}</td>
        <td colspan="1" height="10">${p.name}</td>
        <td colspan="1" height="10">${p.age}</td>
        <td colspan="1" height="10">${p.sex}</td>
        <td colspan="1" height="10">${p.dept}</td>
        <td colspan="1" height="10">${p.pro}</td>
        <td colspan="1" height="10">${p.maj}</td>
        <td colspan="1" height="10"><input type="radio" name="choose"></td>
    </tr>
</c:forEach>
