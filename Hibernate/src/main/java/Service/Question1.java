package Service;

import Domains.Author;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Author author = new Author();
            author.setFirstName("Shekhar");
            author.setLastName("Paatni");
            author.setAge(25);
            session.save(author);

            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        }catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
