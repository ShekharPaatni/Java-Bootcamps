package com.ttn.practice;

public class Example10 implements Runnable {
    @Override
    public void run() {
        displayThreadInfo();
    }
    public void displayThreadInfo(){
        Thread thread = Thread.currentThread();
        System.out.println("Thread Name "+ thread.getName());
        System.out.println("Thread Priority "+ thread.getPriority());
        try {
            System.out.println("Thread State "+ thread.getState());

            Thread.sleep(1);
            System.out.println("Thread State "+ thread.getState());

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Thread State "+ thread.getState());
        System.out.println("Thread Group name "+ thread.getThreadGroup());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example10());
        thread.start();
    }
}
