//4. Write a program to print a table of any number using lambda expression

import java.util.Scanner;

public class LambdaExpression {
    @FunctionalInterface
    interface Multiplication{
        public void multiply(int a);
    }
    public static void main(String[] args) {
        int table_number = 1;
        Multiplication multiplication = (numbers) -> {
            for (int i =1; i< 11; i++)
                System.out.println(numbers + " * "+ i +" = "+ (numbers*i));
        };
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt())
            table_number = scanner.nextInt();
        multiplication.multiply(table_number);
    }
}
