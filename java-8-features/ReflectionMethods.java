//3. Write a program to read all field and method names of a class using reflection

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMethods {
   private String first_name = "shekhar";
   private String last_name  = "Paatni";
    public void display() {

    }
    public void simple() {

    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException{
        ReflectionMethods reflectionMethods = new ReflectionMethods();
        Class class_name = reflectionMethods.getClass();
        Method[] m = class_name.getDeclaredMethods();
        System.out.println("Methods of a class");
        for (Method list: m) {
            System.out.println(list);
        }
        Field[] fields = class_name.getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field);
        }
        Field field = class_name.getDeclaredField("first_name");
        field.setAccessible(true);
        field.set(reflectionMethods, "Mukesh");
        System.out.println(reflectionMethods.first_name);
    }
}
