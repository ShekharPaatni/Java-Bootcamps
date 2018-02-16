//Write a method that takes a string and returns the number of unique characters in the string.


import java.util.*;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        HashMap set = new HashMap();
        for (int i=0; i< text.length(); i++) {
            if (set.containsKey(text.charAt(i))) {
                int count = (int)set.get(text.charAt(i));
                set.put(text.charAt(i), count+1);
            }else {
                set.put(text.charAt(i), 1);
            }
        }
        Iterator iterator = set.keySet().iterator();
        while (iterator.hasNext()){
            Object cha = iterator.next();
            int count = (int)set.get(cha);
            if (count == 1) {
                System.out.println(cha);
            }
        }
    }
}
