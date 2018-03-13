package com.ttn.practice;

public class Example4 implements Runnable{
    @Override
    public void run() {
        int count = 0;
        while (count< 20) {
            count++;
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        new Thread(new Example4()).start();
    }
}
