package com.test;

import com.test.complex.Complex;
import com.test.config.JavaConfig;
import com.test.resturant.Restaurant;
import com.test.resturant.RestaurantController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeController {
    public static void main(String[] args) {
       // ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring-config.xml");
        //Question1&2
//        Database database = applicationContext.getBean(Database.class);
//        System.out.println(database);
        //Question3
//        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
//        restaurant.getHotDrink().prepareHotDrink();
        //Question 5
//        Complex complex = applicationContext.getBean(Complex.class);
//        System.out.println(complex);
        //Question 7

//        Restaurant restaurant = (Restaurant) applicationContext.getBean("restaurant");
//        restaurant.getHotDrink().prepareHotDrink();
    //Java config file
//    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
//    applicationContext.getBean(Database.class).toString();
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        RestaurantController restaurantController = applicationContext.getBean(RestaurantController.class);
        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
        restaurantController.setRestaurant(restaurant);
        restaurantController.display();
    }
}
