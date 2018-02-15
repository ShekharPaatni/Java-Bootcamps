
//Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
public class StaticUse {
    static String firstname = "shekhar";
    static String lastname = "paatni";
    static int age = 25;
    static {
//        System.out.println("Hello! "+ firstname+" "+lastname+ ", Your age is "+ age);
        detailPrint();
    }
    public static void main(String[] args) {
//        detailPrint();
    }
    public static void detailPrint() {
        System.out.println("Hello! "+ firstname+" "+lastname+ ", Your age is "+ age);
    }
}
