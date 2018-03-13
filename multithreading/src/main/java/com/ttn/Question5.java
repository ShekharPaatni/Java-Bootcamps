package com.ttn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5 {
    private static int count;
    private static int sum;
//    private static final String lockme = "lockme";
    private static List<Integer> integerList = new ArrayList<>(Arrays.asList(10,15,125,254,212,250));

    public static void main(String[] args) {
        Question5 question5 = new Question5();
        new Thread(() -> {
            while (integerList.size() > count) {
                System.out.println(count+" " + Thread.currentThread().getName());
                question5.calculation();
            }
        }, "Thread first").start();
        new Thread(() -> {
            while (integerList.size() > count) {

                System.out.println(count+" " + Thread.currentThread().getName());
                question5.calculation();
            }
        }, "Thread second").start();
        new Thread(() -> {
            while (integerList.size() > count) {

                System.out.println(count+" " + Thread.currentThread().getName());
                question5.calculation();

            }
        }, "Thread Third").start();
        new Thread(() -> {
            while (integerList.size() > count) {

                System.out.println(count+" " + Thread.currentThread().getName());
                question5.calculation();
            }
        }, "Thread four").start();

    }

    private  void calculation() {
        synchronized (this) {
            sum+=integerList.get(count);
            count++;
            try {
                this.wait();
                this.notifyAll();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
