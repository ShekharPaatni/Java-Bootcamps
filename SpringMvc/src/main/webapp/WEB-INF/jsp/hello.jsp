<%--
  Created by IntelliJ IDEA.
  User: sam
  Date: 13/3/18
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <h1>Hello Index.jsp</h1>
    <%--Example 6--%>
    <form action="/users" method="post">
        <input type="text" name="username" />
        <input type="password" name="password" />
        <input type="submit" value="Save Data">
    </form>
</body>
</html>
