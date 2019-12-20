package com.home.pizzaweb.controller;


import com.home.pizzaweb.component.PizzaMenuComponent;
import com.home.pizzaweb.model.OrderPizza;
import com.home.pizzaweb.model.Pizza;
import com.home.pizzaweb.model.PizzaMenu;
import com.home.pizzaweb.repository.PizzaMenuRepository;
import com.home.pizzaweb.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/tab02_menu")
//@SessionAttributes({"orderPizza","listMenuPizzas"})
@SessionAttributes("orderPizza")

public class MenuController {

    private PizzaService pizzaService;
    private PizzaMenuComponent pizzaMenuComponent;
    private PizzaMenuRepository pizzaMenuRepository;

    @Autowired
    public MenuController(PizzaService pizzaService, PizzaMenuComponent pizzaMenuComponent, PizzaMenuRepository pizzaMenuRepository) {
        this.pizzaService = pizzaService;
        this.pizzaMenuComponent = pizzaMenuComponent;
        this.pizzaMenuRepository = pizzaMenuRepository;

    }


    @ModelAttribute(name = "orderPizza")
    public OrderPizza orderPizza(@ModelAttribute("orderPizza") OrderPizza orderPizza) {
        return orderPizza;
    }


    @GetMapping
    public String showDesignForm(Model model) {
        List<PizzaMenu> pizzas = pizzaMenuRepository.findAll();

        for (PizzaMenu p : pizzas) {
            int id = p.getId();
            pizzaMenuComponent.setParameters(id);
            //Set the specific parameters of PizzaMenu's objects
            p.setPizzaTypeString();
            p.setIngredientString(pizzaMenuComponent.getIngredientString());
           pizzaMenuRepository.save(p);  // to add the last record in the table. An explanation is needed.
        }
        model.addAttribute("allPizzas", pizzas);
        return "tab02_menu";

    }


    @PostMapping
    public String processDesign(@Valid ArrayList<Pizza> listPizzaMenu, Errors errors, @ModelAttribute OrderPizza orderPizza) {
        if (errors.hasErrors()) {
            return "tab02_menu";
        }


        System.out.println("yes: " + listPizzaMenu);
        for (Pizza pizzaMenu : listPizzaMenu) {
            orderPizza.addPizza(pizzaMenu);
            System.out.println("yes inside: " + listPizzaMenu);
        }

        System.out.println("orderPizza pizza saved: " + orderPizza);
        return "redirect:/orders";
    }


}