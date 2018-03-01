<%--
  Created by IntelliJ IDEA.
  User: sam
  Date: 28/2/18
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="/JSP/login_authetication" method="post">
        <div>
        <span style="color: green; font-size: 15px;"><%= session.getAttribute("login")!=null ? session.getAttribute("login")+"<br/>" : ""%></span>
        <% session.removeAttribute("login"); session.removeAttribute("user_login");%>
        </div>
        <div>
            <span style="color: red; font-size: 15px; display: block;"><%= session.getAttribute("user_login_error")!= null ? session.getAttribute("user_login_error") : ""%></span>
            <span>User Name:</span>
            <input type="text" placeholder="Enter your user name" name="user_name"/>
            <span style="color: red; font-size: 15px;"><%= session.getAttribute("user_name")!= null ? session.getAttribute("user_name") : ""%></span>

        </div>
        <div>
            <span>Password:</span>
            <input type="password" placeholder="Enter your password" name="password"/>
            <span style="color: red; font-size: 15px;"><%= session.getAttribute("password")!= null ?session.getAttribute("password") : ""%></span>
        </div>
        <% session.removeAttribute("user_name");session.removeAttribute("password");session.removeAttribute("user_login_error");%>
        <div>
            <input type="submit" value="Login">
        </div>
    </form>

</body>
</html>
