
import java.util.ArrayList;
import java.util.List;

public class Addition {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 15;
//        int sum = a+b;
//        System.out.println(sum);
        System.out.println("Hello World");
    }
    public int sum(int a , int b ) {
        return a+b;
    }
    public String sum(String a, String b) {
        return a+b;
    }

    public float sum(float a, float b) {
        return  a+b;
    }
    public double sum(double a, double b) {
        return a+b;
    }
    public List sum (List list, List list1) {
        List list2 = new ArrayList();
        list2.addAll(list);
        list2.addAll(list1);
        return list2;
    }
}
