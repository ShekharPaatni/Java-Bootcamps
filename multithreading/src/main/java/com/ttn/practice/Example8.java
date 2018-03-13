package com.ttn.practice;

public class Example8 extends Thread {
    private Example8(String threadName){
        super(threadName);
    }
    @Override
    public void run() {
        printMe();
    }

    public static void main(String[] args) {
        Example8 example8 = new Example8("Printing");
        example8.start();
    }
    private void printMe() {
        int i =0;
        while (i< 20) {
            i++;
            System.out.println(i+" "+ Thread.currentThread().getName());
        }
    }
}
