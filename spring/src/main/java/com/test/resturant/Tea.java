package com.test.resturant;

import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Tea is preparing");
    }

}
