//1. Write a program to copy and paste a file to other location


import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileCopy{
    public static void main(String[] args) throws IOException{
File file = new File("/home/sam/Desktop/Java-Bootcamp/First-core-java-session/file.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        File file_write = new File("/home/sam/Desktop/Java-Bootcamp/First-core-java-session/file1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file_write);
        int n;
        while (( n = fileInputStream.read()) != -1) {
            fileOutputStream.write(n);
            System.out.println((char)n);
        }
        fileInputStream = new FileInputStream(file_write);
        while ((n= fileInputStream.read()) != -1)
            System.out.print((char)n);
        fileInputStream.close();
        fileOutputStream.close();
        FileReader fileReader = new FileReader("/home/sam/Desktop/Java-Bootcamp/First-core-java-session/file.txt");
        int n;
        while ((n = fileReader.read()) != -1) {
            System.out.print((char) n);
        }
        int n;
        //Character Stream
        FileWriter fileWriter = new FileWriter("/home/sam/Desktop/Java-Bootcamp/First-core-java-session/file1.txt");
       FileReader fileReader = new FileReader("/home/sam/Desktop/Java-Bootcamp/First-core-java-session/file2.txt");
        while ((n =  fileReader.read()) != -1) {
            System.out.println((char)n);
            fileWriter.write((char)n);
        }
        fileWriter.close();
    }
}
