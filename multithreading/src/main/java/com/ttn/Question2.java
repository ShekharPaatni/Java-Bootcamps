package com.ttn;
//2. Print Prime and non-prime numbers from 1 to 20 in ascending order using two threads;

public class Question2 {
    public  static void main(String[] args) {
        new Thread(() -> {
           printPrime();
        });
        new Thread(() -> {
            printNonPrime();
        });

    }
    private static void printPrime(){
        for (int i=2; i<20; i++) {
            int m = i/2;
            boolean flag = false;
            for (int j =1; j < m;j++) {
                if (i%j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Prime number"+ i);
            }
        }
    }
    private static void printNonPrime() {

    }
}
