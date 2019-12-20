package com.home.pizzaweb.controller;


import com.home.pizzaweb.model.*;
import com.home.pizzaweb.model.enumType.CompositionType;
import com.home.pizzaweb.repository.IngredientRepository;
import com.home.pizzaweb.repository.PizzaCreatedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/tab03_create")
@SessionAttributes("orderPizza")
public class CreateController {
    private IngredientRepository ingredientRepository;
    private PizzaCreatedRepository pizzaCreatedRepository;

    @Autowired
    public CreateController(IngredientRepository ingredientRepository, PizzaCreatedRepository pizzaCreatedRepository) {
        this.ingredientRepository = ingredientRepository;
        this.pizzaCreatedRepository = pizzaCreatedRepository;
    }

    @ModelAttribute(name = "orderPizza")
    public OrderPizza orderPizza(@ModelAttribute("orderPizza") OrderPizza orderPizza) {
        /*if(orderPizza==null){
            orderPizza = new OrderPizza();
            System.out.println ("First Attribute order: " + orderPizza );
            return orderPizza;
        }
        System.out.println("order 1: " + orderPizza);*/
        return orderPizza;
    }

    @ModelAttribute(name = "create")
    public Pizza create() {

        Pizza create = new PizzaCreated();
        System.out.println("pizza create 1: " + create);
        return create;
    }


    @GetMapping
    public String showDesignForm(Model model) {

        List<Ingredient> ingredients = ingredientRepository.findAll();
        CompositionType[] compositionTypes = CompositionType.values();
        for (CompositionType type : compositionTypes) {
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }


        return "tab03_create";

    }


    @PostMapping
    public String processDesign(
            @Valid PizzaCreated pizzaCreated, Errors errors,
            @ModelAttribute OrderPizza orderPizza) {
        if (errors.hasErrors()) {
            return "tab03_create";

        }

        System.out.println("yes: " + pizzaCreated.getName());
        Pizza saved = pizzaCreatedRepository.save(pizzaCreated);
        orderPizza.addPizza(saved);

        System.out.println("orderPizza pizza saved: " + orderPizza);
        return "redirect:/orders";
    }


    //Method to filter Ingredients by IngredientType
    private List<Ingredient> filterByType(List<Ingredient> ingredients, CompositionType compositionType) {
        return ingredients
                .stream()
                .filter(x -> x.getCompositionType().equals(compositionType))
                .collect(Collectors.toList());
    }


}
