

import java.util.Scanner;

//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
public class OccurencePercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int lowercasecount = 0;
        int uppercasecount = 0;
        int numbercount = 0;
        int specialcharactercount = 0;
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            if (temp > 47 && temp < 58) {
                numbercount++;
            }else if(temp > 96  && temp < 123) {
                lowercasecount++;
            }
            else if(temp > 64 && temp < 91) {
                uppercasecount++;
            }else {
                specialcharactercount++;
            }
        }
        int text_length = text.length();if (text_length > 0) {
            System.out.println("Lowercase Character count "+ lowercasecount + " and the percentage count "+ (lowercasecount*100/text_length)+"%");
            System.out.println("Uppercase Character count "+ uppercasecount + " and the percentage count "+ (uppercasecount*100/text_length)+"%");
            System.out.println("Number count "+ numbercount + " and the percentage count "+ (numbercount*100/text_length)+"%");
            System.out.println("Special Symbol count "+ specialcharactercount + " and the percentage count "+ (specialcharactercount*100/text_length)+"%");
        }

    }
}
