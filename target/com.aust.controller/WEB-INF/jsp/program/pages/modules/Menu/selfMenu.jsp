<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<tr>
    <td align="center" height="10" colspan="9">
        <input type="submit" value="查看哪些人参与了该项目" name="S_Pselect" onclick="s_select()">
    </td>
</tr>
<tr>
    <td colspan="1"><input type="text" size="10" name="Pno" id="Pno"></td>
    <td colspan="1"><input type="text" size="10" name="Pname" id="Pname"></td>
    <td colspan="1"><input type="text" size="10" name="Plevel" id="Plevel"></td>
    <td colspan="1"><input type="text" size="10" name="Ptype" id="Ptype"></td>
    <td colspan="1"><input type="text" size="10" name="Pmajor" id="Pmajor"></td>
    <td colspan="1"><input type="text" size="10" name="Pinfo_start" id="Pinfo_start"></td>
    <td colspan="1"><input type="text" size="10" name="Pinfo_end" id="Pinfo_end"></td>
    <td colspan="1"><input type="text" size="10" name="Pinfo_corporate" id="Pinfo_corporate"></td>
    <td colspan="1"><input type="button" value="清空" onclick="clearAll()"></td>
</tr>
<tr>
    <td colspan="1">
        <center>
            <input type="submit" value="更新" name="Program_update" onclick="p_update()">
        </center>
    </td>
    <td colspan="1">
        <center>
            <input type="submit" value="删除" name="Program_delete" onclick="p_delete()">
        </center>
    </td>
    <td height="10" colspan="7">
        <div align="right" style="font-size: 13px;color: indigo;">
            您现在在第<input type="text" size="2" value="${index}">页
            <input type="submit" value="上一页" name="self_pre_page" onclick="pre()">
            <input type="submit" value="下一页" onclick="next()" name="self_next_page">
            共<input type="text" size="2" value="${page}">页
        </div>
    </td>
</tr>
