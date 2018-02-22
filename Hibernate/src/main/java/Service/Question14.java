package Service;

import Domains.Author;
import Domains.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Question14 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Book book = new Book();
        book.setBookName("JDBC");
        Author author = new Author();
        author.setFirstName("Prachi");
        author.setAge(25);
        author.setBookName(book);
        session.save(book);
        session.save(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
