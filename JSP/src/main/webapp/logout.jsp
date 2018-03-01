<%--
  Created by IntelliJ IDEA.
  User: sam
  Date: 1/3/18
  Time: 12:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout</title>
</head>
<body>
    <%session.removeAttribute("user_login"); response.sendRedirect("/JSP/Login.jsp");%>
</body>
</html>
