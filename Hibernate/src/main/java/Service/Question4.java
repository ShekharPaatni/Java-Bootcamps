package Service;


import Domains.Address;
import Domains.Author;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class Question4 {
    //Question 13
    List<String> subjects = Arrays.asList("Maths", "English", "Hindi", "Science", "SST");
    public static void main(String[] args) {
        Question4 question2 = new Question4();
        SessionFactory sessionFactory =  null;
        Session session = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            Address address = new Address();
            address.setStreetNumber(10);
            address.setLocation("Laxmi Nagar");
            address.setState("Delhi");
            session.save(question2.insertion("Chunky", "Gupta", 25, address));
            session.save(question2.insertion("Shekhar", "Paatni", 25,address));
            session.save(question2.insertion("Prachi", "Julka", 24,address));
            session.save(question2.insertion("Shewta", "Sharma", 24,address));
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();

        }catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public  Author insertion(String first_name, String last_name, int age, Address address) {
        Author author = new Author();
        author.setFirstName(first_name);
        author.setLastName(last_name);
        author.setAge(age);
//        author.setAddress(address);
//        author.setSubjects(subjects);
        return author;
    }
}
