<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<tr>
    <td align="center" height="10" colspan="3">
        <input type="submit" value="查看该论文的作者有哪些" name="S_PAselect" onclick="s_select()">
    </td>
    <td align="center" height="10" colspan="4">
        <input type="submit" value="查看该论文属于哪个研究成果" name="PA_Aselect" onclick="a_select()">
    </td>
</tr>

<tr>
    <td colspan="1"><input type="text" size="10" name="P_Ano" id="P_Ano"></td>
    <td colspan="1"><input type="text" size="35" name="P_Aname" id="P_Aname"></td>
    <td colspan="1"><input type="text" size="10" name="P_Amajor" id="P_Amajor"></td>
    <td colspan="1"><input type="text" size="10" name="P_Atime" id="P_Atime"></td>
    <td colspan="1"><input type="text" size="10" name="P_Apublic" id="P_Apublic"></td>
    <td colspan="1"><input type="text" size="10" name="P_Aquote" id="P_Aquote"></td>
    <td colspan="1"><input type="button" value="清空" onclick="clearAll()"></td>
</tr>
<tr>
    <td colspan="1">
        <center>
            <input type="submit" value="更新" name="Paper_update" onclick="pa_update()">
        </center>
    </td>
    <td colspan="1">
        <center>
            <input type="submit" value="删除" name="Paper_delete" onclick="pa_delete()">
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
