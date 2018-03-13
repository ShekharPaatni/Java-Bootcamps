package com.ttn.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example13 {
    private static int max;
    private List<Integer> integerList = new ArrayList<>(Arrays.asList(10,15,25,12,8));
    public static void main(String[] args)  {
        Example13 example13 = new Example13();
        Thread thread = new Thread(() -> {
           for (int i=0; i<example13.integerList.size(); i++) {
               try {
                   example13.maxValue(example13.integerList.get(i));
               }catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        thread.start();
    }
    private void maxValue(int val) throws InterruptedException{
        synchronized (this) {
            this.notifyAll();
            if (max < val) {
                max = val;
            }
            this.wait();
        }
    }

}
