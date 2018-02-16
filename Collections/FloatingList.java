//Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FloatingList {
    public static void main(String[] args) {
        List number = new ArrayList();
        number.add(0.5);
        number.add(0.8);
        number.add(90.5);
        number.add(15.8);
        number.add(18.5);
        Iterator iterator = number.iterator();
        float sum = 0;
        while (iterator.hasNext()) {
            sum += Float.parseFloat(iterator.next().toString());
        }
        System.out.println("The sum of the 5 floating point number is: "+ sum);
    }
}
