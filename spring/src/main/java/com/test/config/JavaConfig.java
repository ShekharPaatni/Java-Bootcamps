package com.test.config;

import com.test.Database;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configurable
@ComponentScan(basePackages = "com.test")
public class JavaConfig {

    @Bean
    Database database(){
        Database database = new Database();
        database.setPort(1500);
        database.setName("Mysql");
        return database;
    }
}
