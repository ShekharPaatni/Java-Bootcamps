//Write a program to find the number of occurrences of a character in a string without using loop?
import java.util.Arrays;
import java.util.Scanner;

public class OccurrenceOfAChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String no_of_occurrences = String.valueOf(scanner.nextLine().charAt(0));
        int counts = text.length() - text.replace(no_of_occurrences, "").length();
        System.out.println("dkjsdfjklsd "+ counts);
        String new_string = text.replaceAll("\\s+","");
        char[] new_char_string = new_string.toCharArray();
        Arrays.sort(new_char_string);
        String new_string_after_sort = String.valueOf(new_char_string);
        //For every duplicate occurrences in a string
        for (int i=0; i< new_string_after_sort.length(); i++) {
            char temp = new_string_after_sort.charAt(i);
            int count = (new_string_after_sort.lastIndexOf(temp) - new_string_after_sort.indexOf(temp));
            if(count > 0) {
                System.out.println(temp + " ------ " + (count + 1));
                i= new_string_after_sort.lastIndexOf(temp);
            }
        }
        System.out.println("Enter the character to find the occurrence:- ");
        char no_of_occurrence = scanner.nextLine().charAt(0);
        int count = new_string_after_sort.lastIndexOf(no_of_occurrence) - new_string_after_sort.indexOf(no_of_occurrence);
        if (count > 0) {
            System.out.println(count+1);
        }else {
            System.out.println("Invalid character!!!");
        }
    }
}
