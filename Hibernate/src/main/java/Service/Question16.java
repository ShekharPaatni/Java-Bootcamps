package Service;

import Domains.Authors;
import Domains.Books;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Question16 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Authors authors = new Authors();
        Books books = new Books();
        Books books1 = new Books();
        books.setBookName("JDBC");
        books1.setBookName("Oracle");
        authors.setFirstName("Chandra");
        authors.setLastName("Shekhar Paatni");
        authors.setAge(25);
        authors.setBooks(Arrays.asList(books,books1));
        books.getAuthors().add(authors);
        books1.getAuthors().add(authors);
        session.save(books1);
        session.save(books);
        session.save(authors);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
