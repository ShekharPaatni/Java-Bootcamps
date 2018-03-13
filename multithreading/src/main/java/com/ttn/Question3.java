package com.ttn;

public class Question3 {
    private static int value;
    private final static String lock = "lockme";
    public synchronized static void main(String[] args) {

            new Thread(() -> {
                while (true) {
                    something(1);
                }
            }).start();


            new Thread(() -> {
                while (true)
                    something(2);
            }).start();
            new Thread(() -> {
                while (true)
                    something(3);
            }).start();

    }



    private static void something(int x)  {
        synchronized (lock){
            if (value == 0) {
                value =x;
                System.out.print(x);
                try {
                    lock.wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }

            }else {
                if (value == 1 && x == 2){
                    System.out.print(x);
                    value = x;
                }else if (value == 2 && x ==3){
                    System.out.print(x);
                    value = x;
                }else if (value == 3  && x == 1){
                    System.out.print(x);
                    value = x;
                }else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();

            }

        }
    }
}
