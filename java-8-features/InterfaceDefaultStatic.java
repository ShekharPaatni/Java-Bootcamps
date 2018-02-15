//5. Write a program having interface with default and static methods and call them also in your main method
interface Custom{
    default void display() {
        System.out.println("Display the commands");
    }
     static void player() {
        System.out.println("Player have different way of talking.");
    }
    public void loc();
}
public class InterfaceDefaultStatic implements Custom {
    public static void main(String[] args) {
        InterfaceDefaultStatic obj = new InterfaceDefaultStatic();
        obj.display();
        Custom.player();
        obj.loc();

    }

    @Override
    public void loc() {
        System.out.println("Location cannot be traced");
    }
}
