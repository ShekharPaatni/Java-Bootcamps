package com.ttn;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Question4 {
    static int count;
    public static void main(String[] args) {
        Question4.threadCreation();
    }
    public static void threadCreation() {
        new Thread(() -> {
            while(count<10) {
                count++;
                System.out.println("Hello from Thread " + count);
                Question4.threadCreation();
            }
        }).start();
    }
}
