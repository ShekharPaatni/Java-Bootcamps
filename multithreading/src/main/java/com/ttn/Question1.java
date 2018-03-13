//1. Print Odd and even numbers from 1 to 20 in ascending order using two threads;
package com.ttn;

public class Question1 {
    private final static String lockme = "lockme";
    static int count = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            new Question1().printMe();
        }).start();

        new Thread(() -> {
            new Question1().printMe();

        }).start();
    }

    public static void printMe() {
        synchronized (lockme) {
            for (; count < 10; count++) {
                if (count % 2 == 0) {
                    System.out.println("Even Number: " + count + "-" + Thread.currentThread().getName());
                    break;
                } else
                    System.out.println("Odd Number: " + "-" + Thread.currentThread().getName());
                break;
            }
            try {
                lockme.wait();
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            lockme.notify();
        }
    }
}

