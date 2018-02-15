//Write a program to find the number of occurrences of the duplicate words in a string and print them ?

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class DuplicateWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:-");
        String text = scanner.nextLine();
        String[] word = text.trim().split("\\s+");
        int lenght_word = word.length;
        String[] duplicate_word = new String[lenght_word];
        int[] word_count = new int[lenght_word];
        int increment = 0;
        for (int i=0; i< lenght_word; i++) {
            if (word[i] !=(null)) {
                int count = 0;
                int status_code = 0;
                for (int j = i + 1; j < lenght_word; j++) {
                    if (duplicate_word[status_code] != null) {

                        if (duplicate_word[status_code].equalsIgnoreCase(word[i])) {
                            break;
                        }
                    }
                    if (word[i].equalsIgnoreCase(word[j])) {
                        count++;
                    }
                    status_code++;
                }
                if (duplicate_word[increment] == null && count > 0){
                    duplicate_word[increment] = word[i];
                    word_count[increment] = count;
                    increment++;
                }

            }
        }
        System.out.println("Duplicate words");
        for (int i = 0; i< duplicate_word.length; i++) {
            if (duplicate_word[i] != null)
            System.out.println(duplicate_word[i]+ " ======= "+ word_count[i]);
        }
    }
}
