package com.ttn.practice;

public class Example9 implements Runnable{
    @Override
    public void run() {
        System.out.println("This will called as Runnable");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example9());
        thread.start();
        new Runnable(){
            @Override
            public void run() {
                new Thread(new Example9()).start();
            }
        };
    }
}
