
import java.util.Arrays;
import java.util.Scanner;

//There is an array with every element repeated twice except one. Find that element?
public class Repeatedtwice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int array_initial_length = 0;
        if (scanner.hasNextInt())
        array_initial_length = scanner.nextInt();
        scanner.nextLine();
        if (array_initial_length > 0) {
            String[] repeated_element = new String[array_initial_length];
            System.out.println("please enter the element and press enter after every element");
            for (int i = 0; i < repeated_element.length; i++) {
                repeated_element[i] = scanner.nextLine();
            }
            Arrays.sort(repeated_element);
            int index = 1;
            for (int i = 0; i < repeated_element.length; i++) {
                if (i+1 < repeated_element.length) {
                    if (!repeated_element[i].equals(repeated_element[i + 1])) {
                        if (index / 2 != 0)
                            System.out.println(repeated_element[i+1]);
                        index = 1;
                    } else {
                        index++;
                    }
                }else {
                    if (repeated_element[i-1].equals(repeated_element[i])) {
                        if (index / 2 != 0)
                            System.out.println(repeated_element[i]);
                    }else {
                        System.out.println(repeated_element[i]);
                    }
                }
            }
        }else{
            System.out.println("Please enter the number greather than zero or number");
        }

    }
}

