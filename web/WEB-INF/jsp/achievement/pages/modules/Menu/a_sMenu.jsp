<%--
      Created by IntelliJ IDEA.
      User: apple
      Date: 2019-07-11
      Time: 16:29
      To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<tr>
    <td colspan="4">
        <input type="hidden" size="10" id="Sno" name="Sno" value="${Sno}">
        <input type="hidden" size="10" id="Sname" name="Sname" value="${Sname}">
        选中/输入的成果号:<input type="text" size="20" align="left" id="Ano" name="Ano" value="">
        <input type="button" value="清空" onclick="clearAno()">
    </td>
    <td colspan="2">
        <center>
            <input type="submit" value="插入" name= "A_Sinsert" onclick="as_insert()">
        </center>
    </td>
    <td colspan="2">
        <center>
            <input type="submit" value="删除" name= "A_Sdelete" onclick="as_delete()">
        </center>
    </td>
</tr>
<tr>
    <td height="10" colspan="8">
        <div align="right" style="font-size: 13px;color: indigo;">
            您现在在第<input type="text" size="2" value="${index}">页
            <input type="submit" value="上一页" name="S_A_pre_page" onclick="pre()">
            <input type="submit" value="下一页" name="S_A_next_page" onclick="next()">
            共<input type="text" size="2" value="${page}">页
        </div>
    </td>
</tr>
