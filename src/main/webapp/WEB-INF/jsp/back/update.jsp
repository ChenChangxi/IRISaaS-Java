<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019-07-11
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body background="imags/classic.jpg">

<div align="center">
    <div style="height: 30px"></div>
    <form name="update" method="post">
        <table border="1" bordercolor="gold" bgcolor="#fff0f5" width="550"
               style="font-size:12px;align:left;" cellpadding="4">
            <tr>
                <td height="60" colspan="8"><br>
                    <span style="color:green;font-size:20px">
                    <b>
                        <center>
                            <c:choose>
                                <c:when test="${(flag=='achievement') || (flag=='as') || (flag=='apa')}">
                                    您现在在科技成果管理页面
                                    <input type="hidden" name="Ano_t" id="Ano_t" value="${Ano_t}">
                                    <input type="hidden" name="Aname_t" id="Aname_t" value="${Aname_t}">
                                    <input type="hidden" name="Aidentify_t" id="Aidentify_t" value="${Aidentify_t}">
                                    <input type="hidden" name="Aaward_t" id="Aaward_t" value="${Aaward_t}">
                                    <input type="hidden" name="Atransform_t" id="Atransform_t" value="${Atransform_t}">
                                    <input type="hidden" name="Apatent_t" id="Apatent_t" value="${Apatent_t}">

                                    <input type="hidden" name="Sno" id="Sno" value="${Sno}">
                                    <input type="hidden" name="Sname" id="Sname" value="${Sname}">
                                    <input type="hidden" name="P_Ano" id="P_Ano" value="${P_Ano}">
                                    <input type="hidden" name="P_Aname" id="P_Aname" value="${P_Aname}">
                                </c:when>

                                <c:when test="${(flag=='copyright') || (flag=='cs')}">
                                    您现在在科技著作管理页面
                                    <input type="hidden" name="Cno_t" id="Cno_t" value="${Cno_t}">
                                    <input type="hidden" name="Cname_t" id="Cname_t" value="${Cname_t}">
                                    <input type="hidden" name="Cmajor_t" id="Cmajor_t" value="${Cmajor_t}">
                                    <input type="hidden" name="Ctype_t" id="Ctype_t" value="${Ctype_t}">
                                    <input type="hidden" name="Ctime_t" id="Ctime_t" value="${Ctime_t}">
                                    <input type="hidden" name="Cquote_t" id="Cquote_t" value="${Cquote_t}">

                                    <input type="hidden" name="Sno" id="Sno" value="${Sno}">
                                    <input type="hidden" name="Sname" id="Sname" value="${Sname}">
                                </c:when>

                                <c:when test="${(flag=='paper') || (flag=='pas') || (flag=='paa')}">
                                    您现在在科技论文管理页面
                                    <input type="hidden" name="P_Ano_t" id="P_Ano_t" value="${P_Ano_t}">
                                    <input type="hidden" name="P_Aname_t" id="P_Aname_t" value="${P_Aname_t}">
                                    <input type="hidden" name="p_Amajor_t" id="P_Amajor_t" value="${P_Amajor_t}">
                                    <input type="hidden" name="P_Atime_t" id="P_Atime_t" value="${P_Atime_t}">
                                    <input type="hidden" name="P_Apublic_t" id="P_Apublic_t" value="${P_Apublic_t}">
                                    <input type="hidden" name="P_Aquote_t" id="P_Aquote_t" value="${P_Aquote_t}">

                                    <input type="hidden" name="Sno" id="Sno" value="${Sno}">
                                    <input type="hidden" name="Sname" id="Sname" value="${Sname}">
                                    <input type="hidden" name="Ano" id="Ano" value="${Ano}">
                                    <input type="hidden" name="Aname" id="Aname" value="${Aname}">
                                </c:when>

                                <c:when test="${(flag=='program') || (flag=='ps')}">
                                    您现在在科技项目管理页面
                                    <input type="hidden" name="Pno_t" id="Pno_t" value="${Pno_t}">
                                    <input type="hidden" name="Pname_t" id="Pname_t" value="${Pname_t}">
                                    <input type="hidden" name="Plevel_t" id="Plevel_t" value="${Plevel_t}">
                                    <input type="hidden" name="Ptype_t" id="Ptype_t" value="${Ptype_t}">
                                    <input type="hidden" name="Pmajor_t" id="Pmajor_t" value="${Pmajor_t}">
                                    <input type="hidden" name="Pinfo_start_t" id="Pinfo_start_t" value="${Pinfo_start_t}">
                                    <input type="hidden" name="Pinfo_end_t" id="Pinfo_end_t" value="${Pinfo_end_t}">
                                    <input type="hidden" name="Pinfo_corporate_t" id="Pinfo_corporate_t" value="${Pinfo_corporate_t}">

                                    <input type="hidden" name="Sno" id="Sno" value="${Sno}">
                                    <input type="hidden" name="Sname" id="Sname" value="${Sname}">
                                </c:when>

                                <c:when test="${(flag=='scientist') || (flag=='sa') || (flag=='sc') || (flag=='spa') || (flag=='sp')}">
                                    您现在在科技人员管理页面
                                    <input type="hidden" name="Sno_t" id="Sno_t" value="${Sno_t}">
                                    <input type="hidden" name="Sname_t" id="Sname_t" value="${Sname_t}">
                                    <input type="hidden" name="Sage_t" id="Sage_t" value="${Sage_t}">
                                    <input type="hidden" name="Ssex_t" id="Ssex_t" value="${Ssex_t}">
                                    <input type="hidden" name="Sdept_t" id="Sdept_t" value="${Sdept_t}">
                                    <input type="hidden" name="Spro_t" id="Spro_t" value="${Spro_t}">
                                    <input type="hidden" name="Smaj_t" id="Smaj_t" value="${Smaj_t}">

                                    <input type="hidden" name="Cno" id="Cno" value="${Cno}">
                                    <input type="hidden" name="Cname" id="Cname" value="${Cname}">
                                    <input type="hidden" name="P_Ano" id="P_Ano" value="${P_Ano}">
                                    <input type="hidden" name="P_Aname" id="P_Aname" value="${P_Aname}">
                                    <input type="hidden" name="Pno" id="Pno" value="${Pno}">
                                    <input type="hidden" name="Pname" id="Pname" value="${Pname}">
                                    <input type="hidden" name="Ano" id="Ano" value="${Ano}">
                                    <input type="hidden" name="Aname" id="Aname" value="${Aname}">
                                </c:when>
                            </c:choose>
                        </center>
                    </b>
                </span>
                </td>
            </tr>
            <tr>
                <td>
                    <br>

                    <c:choose>
                        <c:when test="${request=='update'}">
                            <center>
                                <span style="font-size:20px;color: darkred">恭喜你，更新成功啦！！</span>
                            </center>
                            <div style="height: 20px"></div>
                            <center>
                                <image src="imags/Avenagers End Game.jpg"
                                       style="height: 300px"></image>
                            </center>
                        </c:when>

                        <c:when test="${request=='insert'}">
                            <center>
                                <span style="font-size:20px;color: darkred">恭喜你，插入成功啦！！</span>
                            </center>
                            <div style="height: 20px"></div>
                            <center>
                                <image src="imags/Avenagers Infinity War.jpg"
                                       style="height: 300px"></image>
                            </center>
                        </c:when>

                        <c:when test="${request=='delete'}">
                            <center>
                                <span style="font-size:20px;color: darkred">恭喜你，删除成功啦！！</span>
                            </center>
                            <div style="height: 20px"></div>
                            <center>
                                <image src="imags/Snap.GIF"
                                       style="height: 300px"></image>
                            </center>
                        </c:when>
                    </c:choose>
                    <div style="height: 20px"></div>

                    <center>
                        <input type="submit" value="返回" name="" onclick="back()">
                    </center>

                    <div style="height: 20px"></div>
                </td>
            </tr>
            <input type="hidden" name="request" id="request" value="select">
            <script type="text/javascript">
                function back() {

                    <%
                    String type = (String)request.getAttribute("flag");
                    %>
                    var type = '<%=type%>';

                    switch (type) {

                        case "achievement": document.update.action="/achievement";break;
                        case "copyright": document.update.action="/copyright";break;
                        case "paper": document.update.action="/paper";break;
                        case "program": document.update.action="/program";break;
                        case "scientist": document.update.action="/scientist";break;
                        case "as": document.update.action="/as";break;
                        case "apa": document.update.action="/apa";break;
                        case "cs": document.update.action="/cs";break;
                        case "pas": document.update.action="/pas";break;
                        case "paa": document.update.action="/paa";break;
                        case "ps": document.update.action="/ps";break;
                        case "sa": document.update.action="/sa";break;
                        case "sc": document.update.action="/sc";break;
                        case "sp": document.update.action="/sp";break;
                        case "spa": document.update.action="/spa";break;
                    }
                    document.update.submit();
                }
            </script>
        </table><br>
    </form>
</div>
</body>
</html>