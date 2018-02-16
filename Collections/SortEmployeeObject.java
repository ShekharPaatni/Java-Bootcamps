//Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age;
// Double Salary; String Name

import java.util.*;

public class SortEmployeeObject{
    double age, salary;
    String name;
    SortEmployeeObject(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return age+" "+name+" "+salary;
    }

    public static void main(String[] args) {
        List<SortEmployeeObject> set = new ArrayList<SortEmployeeObject>();
        set.add(new SortEmployeeObject(10, 150000, "shekhar"));
        set.add(new SortEmployeeObject(10, 180000, "Prachi"));
        set.add(new SortEmployeeObject(10, 150000, "shekhar Paatni"));
        Collections.sort(set, new Comparator<SortEmployeeObject>() {
            @Override
            public int compare(SortEmployeeObject o1, SortEmployeeObject o2) {
                int first = (int) o1.salary;
                int second = (int) o2.salary;
                int final_result = first -second;
                return final_result;
            }
        });
        set.forEach(System.out::println);
    }
}
