<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<tr>
    <td align="center" height="10" colspan="2">
        <input type="submit" value="查看此人参与了哪些项目" name="P_Sselect" onclick="p_select()">
    </td>
    <td align="center" height="10" colspan="2">
        <input type="submit" value="查看此人发表了哪些论文" name="PA_Sselect" onclick="pa_select()">
    </td>
    <td align="center" height="10" colspan="2">
        <input type="submit" value="查看此人有哪些学术成果" name="A_Sselect" onclick="a_select()">
    </td>
    <td align="center" height="10" colspan="2">
        <input type="submit" value="查看此人出版了哪些著作" name="C_Sselect" onclick="c_select()">
    </td>
</tr>
<tr>
    <td colspan="1"><input type="text" size="12" name="Sno" id="Sno"></td>
    <td colspan="1"><input type="text" size="12" name="Sname" id="Sname"></td>
    <td colspan="1"><input type="text" size="12" name="Sage" id="Sage"></td>
    <td colspan="1"><input type="text" size="12" name="Ssex" id="Ssex"></td>
    <td colspan="1"><input type="text" size="12" name="Sdept" id="Sdept"></td>
    <td colspan="1"><input type="text" size="12" name="Spro" id="Spro"></td>
    <td colspan="1"><input type="text" size="12" name="Smaj" id="Smaj"></td>
    <td colspan="1"><input type="button" value="清空" onclick="clearAll()"></td>
</tr>
<tr>
    <td colspan="1">
        <center>
            <input type="submit" value="更新" name="Scientist_update" onclick="s_update()">
        </center>
    </td>
    <td colspan="1">
        <center>
            <input type="submit" value="删除" name="Scientist_delete" onclick="s_delete()">
        </center>
    </td>
    <td height="10" colspan="6">
        <div align="right" style="font-size: 13px;color: indigo;">
            您现在在第<input type="text" size="2" value="${index}">页
            <input type="submit" value="上一页" name="self_pre_page" onclick="pre()">
            <input type="submit" value="下一页" onclick="next()" name="self_next_page">
            共<input type="text" size="2" value="${page}">页
        </div>
    </td>
</tr>

