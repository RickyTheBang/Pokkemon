package com.home.pizzaweb.controller;

import com.home.pizzaweb.model.OrderPizza;
import com.home.pizzaweb.model.Pizza;
import com.home.pizzaweb.model.PizzaCreated;
import com.home.pizzaweb.repository.OrderRepository;
import com.home.pizzaweb.repository.PizzaCreatedRepository;
import com.home.pizzaweb.repository.PizzaMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Controller
@RequestMapping("/orders")
//@SessionAttributes({"orderPizza","listMenuPizzas"})
@SessionAttributes("orderPizza")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;


    @GetMapping
    public String orderForm() {
        return "form01_order";
    }


    @PostMapping
    public String processOrder(@Valid OrderPizza orderPizza, Errors errors, SessionStatus sessionStatus, ModelMap model) {
        if (errors.hasErrors()) {
            return "orderForm";
        }
        System.out.println("order 2: "+orderPizza);
        orderRepository.save(orderPizza);
        System.out.println("order 3: "+orderPizza);
        sessionStatus.setComplete();

       model.addAttribute ("confirmation","Your order will be delivered very soon!");

        return "form02_confirmation";
    }


}
