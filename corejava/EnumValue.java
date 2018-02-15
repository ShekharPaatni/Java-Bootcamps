
import java.util.Scanner;

public class EnumValue {
    enum days {
        Birla, Surya, Aditiya, Jp, Shikar
    }
    EnumValue(){
        days[] obj = days.values();
        for (days objs: obj) {
            System.out.println(objs);
        }
    }
    public void getPrice(String builder) {
        if (builder == "Birla")
            System.out.println(1700);
        else if (builder == "Surya")
            System.out.println(2500);
        else if (builder == "Aditiya")
            System.out.println(3500);
        else if (builder == "Jp")
            System.out.println(2700);
        else
            System.out.println(3520);
    }

    public static void main(String[] args) {
        EnumValue obj = new EnumValue();
        days[] obj1 = days.values();
        System.out.println("Select the Builder for house");
        for (days obj2 : obj1) {
            System.out.println(obj2.ordinal() +" ----- "+ obj2);
        }
        int obj3 = 0;
        try {
            obj3 = new Scanner(System.in).nextInt();
        }catch (Exception e){
            System.out.println("Please select the correct options");
        }
        if (obj1.length>obj3)
            System.out.println(days.values()[obj3]);
        else
            System.out.println("sorry no such builder exists");
    }
}
