<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:forEach items="${plist}" var="p">
    <tr>
        <td colspan="1" height="10">${p.no}</td>
        <td colspan="1" height="10">${p.name}</td>
        <td colspan="1" height="10">${p.level}</td>
        <td colspan="1" height="10">${p.type}</td>
        <td colspan="1" height="10">${p.major}</td>
        <td colspan="1" height="10">${p.infoStart}</td>
        <td colspan="1" height="10">${p.infoEnd}</td>
        <td colspan="1" height="10">${p.infoCorporate}</td>
        <td colspan="1" height="10"><input type="radio" name="choose"></td>
    </tr>
</c:forEach>
