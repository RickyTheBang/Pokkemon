package com.home.pizzaweb.app;

import com.home.pizzaweb.AppConfig;
import com.home.pizzaweb.model.PizzaMenu;
import com.home.pizzaweb.repository.PizzaMenuRepository;
import com.home.pizzaweb.service.ApplicationStartUp;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;


public class PizzawebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(AppConfig.class, args);


        ApplicationStartUp applicationStartUp = ctx.getBean("applicationStartUpImpl", ApplicationStartUp.class);
        applicationStartUp.init();

        // test

        PizzaMenuRepository pizzaMenuRepository = ctx.getBean("pizzaMenuRepository", PizzaMenuRepository.class);















    }
}