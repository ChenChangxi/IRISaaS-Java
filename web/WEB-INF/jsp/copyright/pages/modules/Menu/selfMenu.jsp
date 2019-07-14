<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<tr>
    <td align="center" height="10" colspan="7">
        <input type="submit" value="查看该著作的作者有哪些" name="S_Cselect" onclick="s_select()">
    </td>
</tr>
<tr>
    <td colspan="1"><input type="text" size="10" name="Cno" id="Cno"></td>
    <td colspan="1"><input type="text" size="10" name="Cname" id="Cname"></td>
    <td colspan="1"><input type="text" size="10" name="Cmajor" id="Cmajor"></td>
    <td colspan="1"><input type="text" size="10" name="Ctype" id="Ctype"></td>
    <td colspan="1"><input type="text" size="10" name="Ctime" id="Ctime"></td>
    <td colspan="1"><input type="text" size="10" name="Cquote" id="Cquote"></td>
    <td colspan="1"><input type="button" value="清空" onclick="clearAll()"></td>
</tr>
<tr>
    <td colspan="1">
        <center>
            <input type="submit" value="更新" name="Copyright_update" onclick="c_update()">
        </center>
    </td>
    <td colspan="1">
        <center>
            <input type="submit" value="删除" name="Copyright_delete" onclick="c_delete()">
        </center>
    </td>
    <td height="10" colspan="5">
        <div align="right" style="font-size: 13px;color: indigo;">
            您现在在第<input type="text" size="2" value="${index}">页
            <input type="submit" value="上一页" name="self_pre_page" onclick="pre()">
            <input type="submit" value="下一页" onclick="next()" name="self_next_page">
            共<input type="text" size="2" value="${page}">页
        </div>
    </td>
</tr>

