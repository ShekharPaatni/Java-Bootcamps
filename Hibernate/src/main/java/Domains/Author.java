package Domains;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Author {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Question 11
    @GeneratedValue(strategy = GenerationType.TABLE)
    //Question 6
    @Column(name = "author_id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    //Question 7
    @Transient
    private String lastName;
    @Column(name = "age")
    private int age;
    //Question 3 & Question 8
    @Temporal(TemporalType.DATE)
    @Transient
    private Date dob;
    //Question 11
    @Embedded
    @Transient
    Address address;

    //Question 12
    @ElementCollection
    @Transient
    @JoinTable(name = "Subjects")
    List<String> subjects;

    @OneToOne
    @JoinColumn
    Book bookName;



    public Book getBookName() {
        return bookName;
    }

    public void setBookName(Book bookName) {
        this.bookName = bookName;
    }

    public Author() {
    }

    public Author(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
