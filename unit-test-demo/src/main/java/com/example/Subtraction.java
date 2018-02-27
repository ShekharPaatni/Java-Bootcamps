package com.example;

import java.util.ArrayList;
import java.util.List;

public class Subtraction {
    public int sub(int a, int b) {
        return a-b;
    }
    public float sub(float a, float b) {
        return a-b;
    }
    //Removing same element and providing unique element
    public List intersection(List a, List b) {
        List list = new ArrayList(a);
        list.removeAll(b);
        List list1 = new ArrayList(b);
        list1.removeAll(a);
        list.addAll(list1);
        return list;

    }

}
