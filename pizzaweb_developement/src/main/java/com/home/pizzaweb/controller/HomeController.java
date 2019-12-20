package com.home.pizzaweb.controller;

import com.home.pizzaweb.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/tab01_home"})
public class HomeController {
    @Autowired
    PizzaService pizzaService;// = ctx.getBean("pizzaServiceImpl", PizzaService.class);

    @GetMapping


    public String showDesignForm() {


      /*  pizzaService.printIngredientType();


        pizzaService.printIngredientType();*/
        return "tab01_home";
    }


}
