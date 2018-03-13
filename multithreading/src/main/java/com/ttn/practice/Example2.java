package com.ttn.practice;

public class Example2 extends Thread {
    @Override
    public void run() {
        System.out.println("Now this will call and run it own method");
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        example2.start();
        Thread thread = new Thread();
        thread.start();
    }
}
