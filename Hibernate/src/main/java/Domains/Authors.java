package Domains;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    @Column(name = "name")
    private String firstName;
    @Column(name = "surname")
    private String lastName;
    private int age;
//    @OneToMany(mappedBy = "authors")
//    @OneToMany(cascade = CascadeType.PERSIST)
    @ManyToMany(mappedBy = "authors")
    private List<Books> books = new ArrayList<Books>();

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
