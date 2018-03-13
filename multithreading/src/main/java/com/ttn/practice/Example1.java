package com.ttn.practice;
//Implementing Runnable Interface
public class Example1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello I am new thread and my name is "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example1(), "First Thread");
        thread.start();
    }
}
