<%@ page import="org.apache.commons.lang3.StringUtils" %>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: sam--%>
  <%--Date: 27/2/18--%>
  <%--Time: 2:32 PM--%>
  <%--To change this template use File | Settings | File Templates.--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Printing number</title>
</head>
<body>
<% String number = request.getParameter("input-number");
    if (StringUtils.isNumeric(number) && Integer.valueOf(number) > 1) {
        for (int i =1 ; i <= Integer.valueOf(number); i++) {%>
            <%= i%>
            <br/>
        <%}
    }else{%>
        <%= "Please enter the positive number." %>
    <%}%>
</body>
</html>
