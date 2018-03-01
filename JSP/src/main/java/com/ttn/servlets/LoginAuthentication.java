package com.ttn.servlets;

import com.ttn.domains.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginAuthentication extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("Login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("user_name");
        String password = req.getParameter("password");
        HttpSession httpSession = req.getSession();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = session.get(User.class, userName);
        if (user.getPassword().equals(password)) {
            httpSession.setAttribute("user_login", userName);
            resp.sendRedirect("/JSP/dashboard.jsp");
        }else {
            httpSession.setAttribute("user_login_error", "Incorrect User name and password");
            resp.sendRedirect("/JSP/Login.jsp");
        }
    }
}
