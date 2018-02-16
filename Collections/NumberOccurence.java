//Write a method that takes a string and print the
// number of occurrence of each character characters in the string.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NumberOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        HashMap set = new HashMap();
        for (int i = 0; i < text.length(); i++) {
            if (set.containsKey(text.charAt(i))) {
                int count = (int)set.get(text.charAt(i));
                set.put(text.charAt(i), count+1);
            }else{
                set.put(text.charAt(i), 1);
            }
        }
        Iterator iterator = set.keySet().iterator();
        while (iterator.hasNext()) {
            Character temp = (Character)iterator.next();
            System.out.println("Key is "+ temp + " --- "+ set.get(temp));
        }
    }
}
