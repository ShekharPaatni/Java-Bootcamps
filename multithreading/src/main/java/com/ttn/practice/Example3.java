package com.ttn.practice;

public class Example3 extends Thread{
    @Override
    public void run() {
        int count = 0;
        while (count<20) {
            count++;
            System.out.println(count);

        }
    }

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        example3.start();
    }
}
