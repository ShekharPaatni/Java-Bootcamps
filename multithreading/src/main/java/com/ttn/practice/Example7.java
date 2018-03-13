package com.ttn.practice;

public class Example7 extends  Thread{
    @Override
    public void run() {
        System.out.println("Example 7 thread will called by the thread");
    }

    public static void main(String[] args) {
        Example7 example7 = new Example7();
        example7.start();


    }
}
