package com.ttn.servlets;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class BlogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        boolean status = true;
        String blogId  = request.getParameter("blog_id");
        String blog_description = request.getParameter("blog_info");
        HttpSession httpSession =  ((HttpServletRequest) request).getSession();
        if (!blogId.matches("[0-9]+")){
            status = false;
            httpSession.setAttribute("blog_id", "Blog id should be Integer or not Empty.");
        }
        if (blog_description.isEmpty()){
            status = false;
            httpSession.setAttribute("blog_description", "Blog Description should not be empty.");
        }
        if (status) {
            chain.doFilter(request, response);
        }else {
            ((HttpServletResponse) response).sendRedirect("/JSP/dashboard.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
