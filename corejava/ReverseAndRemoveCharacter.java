
import java.util.Scanner;

//Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer.
public class ReverseAndRemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer text = new StringBuffer(scanner.nextLine());
        StringBuffer temp = new StringBuffer(text);
        text.reverse();
        System.out.println(text.substring(0,4)+text.substring(9));
        System.out.println("-----------------without function in StringBuffer------------");
        int count = 0;
        StringBuffer temp1 = new StringBuffer(temp.length());
        for (int i = temp.length()-1; i >= 0; i--) {

            if (temp.length() > 10) {
                if (count >= 4 && count < 9) {
                    count++;
                    continue;
                }
                else
                    temp1.append(temp.charAt(i));
            }else{
                temp1.append(temp.charAt(i));
            }
            count++;
        }

        System.out.println(temp1);
    }
}
