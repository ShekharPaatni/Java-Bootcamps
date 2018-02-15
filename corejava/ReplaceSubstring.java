
import java.util.Scanner;

//Write a program to replace a substring inside a string with other string ?
public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:-");
        String text = scanner.nextLine();
        System.out.println("Enter the substring you want to replace:-");
        String find_str = scanner.nextLine();
        System.out.println("Enter the substring for replace");
        String repl_str = scanner.nextLine();
        int count = find_str.length();
        String new_string = "";
        for (int i = 0; i < text.length(); i++) {
            if ((i+count) <= text.length()) {
                if (find_str.equals(text.substring(i, i+count))) {
                    new_string += repl_str;
                    i = i + count - 1;
                }else {
                    new_string += text.charAt(i);
                }
            }else{
                new_string += text.substring(i);
                break;
            }
        }
        System.out.println("After replacing "+ find_str +" with "+repl_str+" new string is " + new_string);
        System.out.println("The same funcationality with the function:-");
        String new_string_replace = text.replace(find_str, repl_str);
        System.out.println("The text will be replace using replace function:- "+new_string_replace);
        String new_string_replaceall = text.replaceAll(find_str, repl_str);
        System.out.println("The text will be replace using replaceAll function:- "+new_string_replaceall);
    }
}
