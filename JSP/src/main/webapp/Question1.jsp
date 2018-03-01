<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: sam
  Date: 27/2/18
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Time Information</title>
</head>
<body>
<h1>
    <%--<% SimpleDateFormat simpleDateFormat = new SimpleDateFormat("H:m:s");%>--%>
    <%--Hello! The time is now...<%= new Date().getHours() + ":"+ (new Date().getMinutes() < 10 ? "0"+new Date().getMinutes() : new Date().getMinutes())+":"+((new Date().getSeconds()<10) ? "0"+new Date().getSeconds() : new Date().getSeconds())%>--%>
    <%--<br />--%>
    Hello! The time is now...<%= new SimpleDateFormat("H:mm:s a").format(new Date()) %>

</h1>
</body>
</html>
