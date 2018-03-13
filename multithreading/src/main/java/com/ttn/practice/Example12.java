package com.ttn.practice;

class Example12 {
    private static int count = 1;
    private final String lockme= "lockme";
    /*private Example12(String threadName){
        super(threadName);
    }
    @Override
    public void run() {
        try{
            printNumber();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) throws InterruptedException {
        /*Example12 thread = new Example12("First Thread");
        Example12 thread1 = new Example12("Second Thread");
        thread.start();
        thread1.start();*/
        Example12 example12 = new Example12();

        Runnable r1 = () -> {
            for(int i = 1; i<11; i++) {
                if (i%2 != 0) {
                    example12.printNumber(i, false);
                }
            }
            example12.notifyOtherThread();
        };

        Runnable r2 = () -> {
            for(int i = 1; i<11; i++) {
                if (i%2 == 0) {
                    example12.printNumber(i, true);
                }
            }
            example12.notifyOtherThread();
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
    synchronized void printNumber(int i, boolean isEven) {
        System.out.println((isEven ? "Even" : "Odd") + "Number "+ i+" "+ Thread.currentThread().getName());
        notifyAll();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void notifyOtherThread() {
        notifyAll();
    }
}