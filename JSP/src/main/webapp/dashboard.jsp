<%--
  Created by IntelliJ IDEA.
  User: sam
  Date: 1/3/18
  Time: 11:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
<%if(session.getAttribute("user_login") != null){%>
    <a href="/JSP/logout.jsp" style="text-decoration: none;float: right; clear: both;">Logout</a>
    <h1>Welcome to First Example</h1>
<%} else {response.sendRedirect("/JSP/Login.jsp");}%>

</body>
</html>
