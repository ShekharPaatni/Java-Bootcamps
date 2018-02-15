//6. Create a class Employee with name and age. Then write a program to print all those employees whose name start
// with n and age is greater than 24.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private String name;

    EmployeeFilter(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "  "+this.age;
    }

    public static void main(String[] args) {
        EmployeeFilter employeeFilter = new EmployeeFilter(27, "nancy");
        EmployeeFilter employeeFilter1 = new EmployeeFilter(25, "Shekhar");
        EmployeeFilter employeeFilter2 = new EmployeeFilter(24, "Raj Chota Bhai");
        EmployeeFilter employeeFilter3 = new EmployeeFilter(25, "Kavita Bora");
        List<EmployeeFilter> list = Arrays.asList(employeeFilter,employeeFilter1,employeeFilter2,employeeFilter3);
         list.stream().filter(n -> n.getName().startsWith("n")).filter(n -> n.getAge() > 24).forEach(System.out::println);

    }
}
