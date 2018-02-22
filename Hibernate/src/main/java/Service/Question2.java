package Service;

import Domains.Author;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Question2 {
    public static void main(String[] args) {
        Question2 question2 = new Question2();
        SessionFactory sessionFactory =  null;
        Session session = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();

            session.save(new Author("Chunky", "Gupta", 25));
            session.save(question2.getAuthor("Shekhar", "Paatni", 25));
            session.save(question2.getAuthor("Prachi", "Julka", 24));
            question2.read(session);
            session.update(question2.update(session));
            question2.read(session);
            session.delete(session.get(Author.class, 3));
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();

        }catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
    public  Author update(Session session) {
        Author author = (Author) session.get(Author.class, 1);
        author.setFirstName("Chutney");
        return author;
    }
    public  void read(Session session) {
        Author author = (Author)session.get(Author.class, 1);
        System.out.println(author);
    }
    public  Author getAuthor(String first_name, String last_name, int age) {
        Author author = new Author();
        author.setFirstName(first_name);
        author.setLastName(last_name);
        author.setAge(age);
        return author;
    }
}
