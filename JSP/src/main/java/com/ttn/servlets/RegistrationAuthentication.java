package com.ttn.servlets;

import com.ttn.domains.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationAuthentication extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/JSP/");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user_already_exist = session.get(User.class, req.getParameter("user_name"));
        if (user_already_exist == null) {
            User user = new User();
            user.setFirstName(req.getParameter("first"));
            user.setLastName(req.getParameter("last_name"));
            user.setUserName(req.getParameter("user_name"));
            user.setPassword(req.getParameter("password"));
            user.setEmail(req.getParameter("email_address"));
            session.save(user);
            req.getSession().setAttribute("login","Congratulations!! You have successfully register.");
            resp.sendRedirect("/JSP/Login.jsp");
        }else {
            req.getSession().setAttribute("user_already", "User name already exists");
            resp.sendRedirect("/JSP/");
        }
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }


}