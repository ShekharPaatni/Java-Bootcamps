//Write a single program for following operation using overloading A) Adding 2 integer number B) Adding 2 double C) Multipling 2 float d) Multipling 2 int E) concate 2 string F) Concate 3 String

public class MethodOverloading {
    public void sum(int a, int b) {
        System.out.println(a*b);
    }
    public void sum(double a, double b) {
        System.out.println(a+b);
    }
    public void multiply(float a, float b) {
        System.out.println(a*b);
    }
    public void multiply(int a, int b) {
        System.out.println(a*b);
    }
    public void add(String a, String b) {
        System.out.println(a+b);
    }
    public void add(String a,String b, String c) {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add("123", "465");
        obj.sum(6,5);
        obj.sum(6.5,7.5);
        obj.multiply(8,7);
        obj.multiply(7.6f,8.6f);
    }
}
