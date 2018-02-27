package com.example;

import java.util.ArrayList;
import java.util.List;

public class Addition {
    public static void main(String[] args) {
        System.out.println("This is about adding two integer numbers.");
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }

    int sum(int a,int b){
        return a+b;
    }

    String sum(String fName,String lName){
        return fName+lName;
    }

    List sum(List listA, List listB){
        List list=new ArrayList();
        list.addAll(listA);
        list.addAll(listB);
        return list;
    }
    float sum(float a, float b) {
        return a+b;
    }
    double sum(double a, double b) {
        return a+b;
    }

}
