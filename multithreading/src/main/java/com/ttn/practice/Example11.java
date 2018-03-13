package com.ttn.practice;

public class Example11 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("ttn");
        threadGroup.setMaxPriority(5);
        Thread thread = new Thread(threadGroup,new Example11(),"thread");
        thread.start();
        thread.setPriority(3);
    }
}
