package com.test.resturant;

import org.springframework.stereotype.Component;

public class ExpressTea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing Express tea");
    }
}
