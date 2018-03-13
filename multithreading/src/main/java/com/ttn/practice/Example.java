package com.ttn.practice;

import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

import java.util.Timer;

public class Example implements Runnable{
    @Override
    public void run() {
        threadInformation();
    }

    public static void main(String[] args) throws InterruptedException{
        new Example().threadInformation();
        Thread thread = new Thread(new Example(),"my thread");
        thread.start();
        thread.join();
        Thread.sleep(1000);
        new Example().threadInformation();
    }
    private void threadInformation() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
    }
}
