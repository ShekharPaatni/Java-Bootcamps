package com.ttn.servlets;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.LinkedHashMap;

public class RegistationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        boolean status = true;
        HttpSession httpSession = ((HttpServletRequest) request).getSession();

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if(httpServletRequest.getMethod().equalsIgnoreCase("POST")) {
            ((HttpServletRequest) request).getSession().setAttribute("error",linkedHashMap);

            String first = (String) request.getParameter("first");
                if (!first.matches("[A-z]+")) {
                    status = false;
                    httpSession.setAttribute("first_error","Please enter the correct first name");
                }
                String last_name = (String) request.getParameter("last_name");
                if (!last_name.matches("[A-z]+")) {
                    status = false;
                    httpSession.setAttribute("last_error","Please enter the correct last name");
                }
                String user_name = (String) request.getParameter("user_name");
                if (!user_name.matches("[A-z0-9]+")) {
                    status = false;
                    httpSession.setAttribute("user_name_error","Please enter the correct user name");
                }
                String password = (String) request.getParameter("password");
                if (!password.matches("[A-z0-9@$]+")) {
                    status = false;
                    httpSession.setAttribute("password_error", "Please enter the correct password");
                }
                String email_address = (String) request.getParameter("email_address");
                if (!email_address.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-zA-Z]{2,})$")) {
                    status = false;
                    httpSession.setAttribute("email_address", "Please enter the correct email address");
                }

        }
        if (status) {
            chain.doFilter(request, response);
        }else {
//            request.setAttribute("error","error");
//            request.getRequestDispatcher("Register.jsp").forward(request, response);
            httpServletResponse.sendRedirect("/JSP/");
        }
    }

    @Override
    public void destroy() {

    }
}
