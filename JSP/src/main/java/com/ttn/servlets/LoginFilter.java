package com.ttn.servlets;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter  implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        boolean status = true;
        String user_name = request.getParameter("user_name");
        String password = request.getParameter("password");
        HttpSession httpSession = ((HttpServletRequest) request).getSession();
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        if (!user_name.matches("[A-z0-9]+")) {
            status = false;
            httpSession.setAttribute("user_name", "User name should contains only alphanumeric.");
        }
        if (!password.matches("[A-z0-9@$]+")) {
            status = false;
            httpSession.setAttribute("password", "Password is incorrect.");
        }
        if (status) {
            chain.doFilter(request, response);
        }else {
            httpServletResponse.sendRedirect("/JSP/Login.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
