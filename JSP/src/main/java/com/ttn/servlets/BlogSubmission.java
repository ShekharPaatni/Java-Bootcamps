package com.ttn.servlets;

import com.ttn.domains.Blog;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BlogSubmission extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int blogId  = Integer.valueOf(req.getParameter("blog_id"));
        String blog_description = req.getParameter("blog_info");
        Blog blog = new Blog();
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Blog blog1 = session.get(Blog.class, blogId);
            if (blog1 == null) {
                blog.setBlogId(blogId);
                blog.setBlogDescription(blog_description);
                session.save(blog);
                session.getTransaction().commit();
                session.close();
                sessionFactory.close();
                req.getSession().setAttribute("blog_status", "Successfully saved the blog");
            }else{
                req.getSession().setAttribute("blog_status_error", "Blog id already exists");

            }
            resp.sendRedirect("/JSP/dashboard.jsp");
        }
        catch (HibernateException e) {
            req.getSession().setAttribute("blog_status_error" , "Unsuccessfully saved the blog");
            resp.sendRedirect("/JSP/dashboard.jsp");
        }
    }
}
