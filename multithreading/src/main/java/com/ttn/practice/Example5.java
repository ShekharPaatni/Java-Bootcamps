package com.ttn.practice;

public class Example5 {
    public static void main(String[] args) throws InterruptedException{
        int count = 0;
        Thread thread = new Thread(() -> {
            for (int i = 1; i<20; i++){
                if (i%2 == 0)
                    System.out.println(i);
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });


        Thread thread1 = new Thread(()-> {
            for (int i=1; i<20 ; i++) {
                if (i%2 !=0)
                    System.out.println(i);
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread1.start();


    }
}

