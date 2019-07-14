<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<tr>
    <td align="center" height="10" colspan="3">
        <input type="submit" value="查看哪些人参与了该研究成果" name="S_Aselect" onclick="s_select()">
    </td>
    <td align="center" height="10" colspan="4">
        <input type="submit" value="查看该研究成果发表了哪些论文" name="A_PAselect" onclick="pa_select()">
    </td>
</tr>

<tr>
    <td colspan="1"><input type="text" size="10" name="Ano" id="Ano"></td>
    <td colspan="1"><input type="text" size="35" name="Aname" id="Aname"></td>
    <td colspan="1"><input type="text" size="10" name="Aidentify" id="Aidentify"></td>
    <td colspan="1"><input type="text" size="10" name="Aaward" id="Aaward"></td>
    <td colspan="1"><input type="text" size="10" name="Atransform" id="Atransform"></td>
    <td colspan="1"><input type="text" size="10" name="Apatent" id="Apatent"></td>
    <td colspan="1"><input type="button" value="清空" onclick="clearAll()"></td>
</tr>
<tr>
    <td colspan="1">
        <center>
            <input type="submit" value="更新" name="Achievement_update" onclick="a_update()">
        </center>
    </td>
    <td colspan="1">
        <center>
            <input type="submit" value="删除" name="Achievement_delete" onclick="a_delete()">
        </center>
    </td>
    <td height="10" colspan="5">
        <div align="right" style="font-size: 13px;color: indigo;">您现在在第<input type="text" size="2" value="${index}">页
            <input type="submit" value="上一页" name="self_pre_page" onclick="pre()">
            <input type="submit" value="下一页" name="self_next_page" onclick="next()">
            共<input type="text" size="2" value="${page}">页
        </div>
    </td>
</tr>