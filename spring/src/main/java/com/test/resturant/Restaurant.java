package com.test.resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
//    @Autowired
//    @Qualifier("expressTeaRestaurant")
    private HotDrink hotDrink;

    @Autowired
    public Restaurant(HotDrink hotDrink){
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }
    //Question 8
    //@Required
    //Question 9
//    @Autowired
//    @Qualifier("expressTeaRestaurant")
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}
