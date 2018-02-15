
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Write a program to read text file & print the content of file using String Builder.
public class FileRead {
    public static void main(String[] args) {
        try {
            File file = new File("/home/sam/Desktop/Java-Bootcamp/First-core-java-session/src/text.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null) {
                sb.append(line);
            }
            System.out.println(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
