package com.ttn.practice;

import java.util.Timer;

public class Example6 {
    public static void main(String[] args) throws InterruptedException{
        //First example for running the anonymous
        new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
        },"New Thread").start();

        //Second examphle
        Thread thread = new Thread(() -> printMe());
        thread.start();

    }

    public static synchronized void printMe(){
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
