<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<tr>
    <td colspan="5">
        <input type="hidden" size="10" id="Pno" name="Pno" value="${Pno}">
        <input type="hidden" size="10" id="Pname" name="Pname" value="${Pname}">
        选中/输入的科技人员工号：<input type="text" size="20" align="left" id="Sno" name="Sno" value="">
        <input type="button" value="清空" onclick="clearSno()">
    </td>
    <td colspan="2">
        <center>
            <input type="submit" value="插入" name= "S_Pinsert" onclick="sp_insert()">
        </center>
    </td>
    <td colspan="2">
        <center>
            <input type="submit" value="删除" name= "S_Pdelete" onclick="sp_delete()">
        </center>
    </td>
</tr>
<tr>
    <td height="10" colspan="9">
        <div align="right" style="font-size: 13px;color: indigo;">
            您现在在第<input type="text" size="2" value="${index}">页
            <input type="submit" value="上一页" name="S_P_pre_page" onclick="pre()">
            <input type="submit" value="下一页" name="S_P_next_page" onclick="next()">
            共<input type="text" size="2" value="${page}">页
        </div>
    </td>
</tr>

