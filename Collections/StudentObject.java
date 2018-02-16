//Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class
// Student{ String Name; Double Score; Double Age.

import java.util.*;

public class StudentObject {
    String name;
    double score, age;
    StudentObject(String name, double score, double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" "+score+ " "+age;
    }

    public static void main(String[] args) {
        List<StudentObject> list = new ArrayList<StudentObject>();
        list.add(new StudentObject("Shekhar",15.5, 25));
        list.add(new StudentObject("sarachi", 15.8, 25));
        list.add(new StudentObject("Sahil", 15.8, 27));
        list.add(new StudentObject("Chunky", 25, 27));
        Collections.sort(list, new Comparator<StudentObject>() {
            @Override
            public int compare(StudentObject o1, StudentObject o2) {
                if (o1.score == o2.score) {
                    return o1.name.compareToIgnoreCase(o2.name);
                }else {
                    int first = (int)o1.score;
                    int second = (int)o2.score;
                    int final_result = first - second;
                    return final_result;
                }
            }
        });
        list.forEach(System.out::println);
    }
}
