//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
// and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected
// complexity ­ O(1))

import java.util.Arrays;
import java.util.Scanner;

public class SpecialStack {
    int top = -1;
    int min_top = -1;
    int[] arr = new int[10];
    int[] min_arr = new int[10];

    {
        Arrays.fill(arr, -1);
        Arrays.fill(min_arr, -1);
    }

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpecialStack stack = new SpecialStack();
        boolean status = true;
        while (status) {
            System.out.println("Please select the option:- \n1. Push the Stack." +
                    "\n2. Pop the Stack\n3.Is stack is empty\n4. Is stack is full" +
                    "\n5. Get the minimum element.\n6. Exit the program.");
            int choice = 6;
            if (scanner.hasNextInt())
                choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    stack.pushStack(scanner);
                    System.out.println("*************");
                    break;
                case 2:
                    stack.pullStack();
                    System.out.println("*************");
                    break;
                case 3:
                    stack.isEmpty();
                    System.out.println("*************");
                    break;
                case 4:
                    stack.isFull();
                    System.out.println("*************");
                    break;
                case 5:
                    stack.getLastElement();

                    System.out.println("*************");
                    break;
                case 6:
                    stack.printObject();
                    System.out.println("Good bye!!!");
                    System.out.println("*************");
                    status = false;
                    break;
            }

        }
    }
    void pullStack() {
        if (top > -1){
            if (arr[top] == min_arr[min_top]) {
                System.out.println("Element remove from stack is:- "+ arr[top]);
                arr[top] = -1;
                top--;
                min_arr[min_top] = -1;
                min_top--;
            }else {
                System.out.println("Element remove from stack is:- "+ arr[top]);
                arr[top] = -1;
                top--;
            }
        }else {
            System.out.println("Stack is underflow");
        }
    }
    void isFull(){
        if (top >= arr.length -1){
            System.out.println("Stack is full");
        }else {
            System.out.println("Stack has a space");
        }
    }
    void isEmpty() {
        if (top< 0) {
            System.out.println("Stack is empty");
        }else
            System.out.println("Stack has some element");
    }
    void getLastElement() {
        if (min_top > -1)
            System.out.println("Minimum element is: " + min_arr[min_top]);
        else
            System.out.println("Stack is underflow");
    }

    void pushStack(Scanner scanner) {
        if (top < arr.length-1 ) {
            System.out.println("Enter the element:");
            int element;
            if (scanner.hasNextInt()) {
                element = scanner.nextInt();
                if (min_top == -1) {
                    min_arr[0] = element;
                    arr[0] = element;
                    min_top = 0;
                    top = 0;
                } else {
                    if (min_arr[min_top] > element) {

                        min_arr[min_top + 1] = element;
                        System.out.println(min_arr[min_top + 1]);
                        min_top += 1;
                        arr[top + 1] = element;
                        top += 1;
                    } else {
                        arr[top + 1] = element;
                        top += 1;
                    }
                }
            } else System.out.println("Sorry! Please enter the number as an element.");
        }else System.out.println("Stack is already full;");
    }

    void printObject() {
        System.out.println("Minimum element is: " + min_arr[min_top]);
        System.out.println("Last elemeny is: " + arr[top]);
    }

}
