//2. Write a program to serialize a class Employee with property name and age. Then deserialize it and print values.

import java.io.*;

public class SerializeCopy implements Serializable{
    int age;
    String name;
    public static final long serialVersionUID = 1L;
    SerializeCopy(int age, String name) {
        this.age = age;
        this.name =  name;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        SerializeCopy serializeCopy =  new SerializeCopy(25, "Shekhar");
       FileOutputStream fileOutputStream = new FileOutputStream("/home/sam/Desktop/Java-Bootcamp/First-core-java-session/serializeObject.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializeCopy);
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("/home/sam/Desktop/Java-Bootcamp/First-core-java-session/serializeObject.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializeCopy serializeCopy1 = (SerializeCopy)objectInputStream.readObject();
    }
}
