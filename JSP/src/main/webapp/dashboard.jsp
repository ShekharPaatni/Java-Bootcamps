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
    <form method="post" action="/JSP/blog">
        <div style="margin-top: 10%; margin-left: 25%; width: 70%; height: 150px;">
            <span style="color: green; font-size: 18px;"><%= session.getAttribute("blog_status")!= null ? session.getAttribute("blog_status") : "" %></span>
            <span style="color: red; font-size: 18px;"><%= session.getAttribute("blog_status_error")!= null ? session.getAttribute("blog_status_error") : "" %></span>
                <div>
                    <span style="font-size: 24px; font-weight: bold;">Blog Id <span style="color: red">*</span></span>
                    <input type="text" name="blog_id">
                    <span style="font-size: 16px; color: red;"><%= session.getAttribute("blog_id") != null ? session.getAttribute("blog_id") : ""%></span>
                </div>
                <div>
                    <span style="font-size: 24px; font-weight: bold;">Blog Description <span style="color: red">*</span></span>
                    <textarea cols="100" rows="10" name="blog_info" style="resize: none; overflow: hidden;"></textarea>
                    <input type="submit" value="Add" style="border: none; background: green; color: white; height: 25px; margin-right: 68px;  width: 120px;font-size: 18px; float: right; margin-top: 15px;">
                    <br>
                    <span style="font-size: 16px; color: red;"><%= session.getAttribute("blog_description") != null ? session.getAttribute("blog_description") : ""%></span>
                </div>
            <%session.removeAttribute("blog_id");session.removeAttribute("blog_status"); session.removeAttribute("blog_status_error");session.removeAttribute("blog_description");%>
        </div>
    </form>
<%} else {response.sendRedirect("/JSP/Login.jsp");}%>

</body>
</html>
