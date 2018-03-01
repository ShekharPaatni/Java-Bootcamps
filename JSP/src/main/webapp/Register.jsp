<%--
  Created by IntelliJ IDEA.
  User: sam
  Date: 27/2/18
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
    <style type="text/css">
        .layout {
            padding: 5px;
            clear: both;
        }
        .layout span{
            float: left;
        }
        .layout input{
            float: right;
            width: 250px;
            height: 40px;
        }
        input[type='submit'] {
            height: 40px;
            width: 150px;
            float: left;
            color: white;
            background: green;
            font-size: 18px;
            cursor: pointer;
        }
        .errors{
            font-size: 11px;
            color: red;
            margin-left: 27%;
        }
    </style>

</head>
<body>
        <form action="/JSP/authenticate" method="post" style="text-align: center; margin-top: 20%;margin-left: 40%; width: 350px;">
            <span class="errors"><%=session.getAttribute("user_already")!= null ? session.getAttribute("user_already") :""%></span>
            <%session.removeAttribute("user_already");%>
        <div class="layout">
            <span>First Name</span><input type="text" placeholder="Enter your name" name="first">
            <span class="errors"><%= session.getAttribute("first_error")!=null ? session.getAttribute("first_error") : ""%></span>
            <%session.removeAttribute("first_error");%>
        </div>
        <div class="layout">
            <span>Last Name</span><input type="text" placeholder="Enter your last name" name="last_name">
            <span class="errors"><%= session.getAttribute("last_error") != null ? session.getAttribute("last_error") : "" %></span>
            <%session.removeAttribute("last_error");%>
        </div>
        <div class="layout">
            <span>User Name</span><input type="text" placeholder="Enter your user name" name="user_name">
            <span class="errors"><%= session.getAttribute("user_name_error") != null ? session.getAttribute("user_name_error") : ""%></span>
            <%session.removeAttribute("user_name_error");%>
        </div>
        <div class="layout">
            <span>Password</span><input type="password" placeholder="Enter your password" name="password">
            <span class="errors"><%= session.getAttribute("password_error")!= null ? session.getAttribute("password_error") : "" %></span>
            <%session.removeAttribute("password_error");%>
        </div>
        <div class="layout">
            <span>Email</span><input type="email" placeholder="Enter your email address" name="email_address">
            <span class="errors"><%= session.getAttribute("email_address")!= null ? session.getAttribute("email_address") : ""%></span>
            <%session.removeAttribute("email_address");%>
        </div>
        <div class="layout">
            <input type="submit" value="Sign Up">
            <a href="/JSP/Login.jsp" style="float: right;text-decoration: none">Sign In</a>
        </div>
    </form>
</body>
</html>
