package com.home.pizzaweb.model;


import com.home.pizzaweb.model.enumType.IngredientType;
import com.home.pizzaweb.model.enumType.PizzaType;
import com.home.pizzaweb.service.PizzaService;
import com.home.pizzaweb.service.implementation.PizzaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pizza implements Product{






    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "PizzaGenerator")

    @TableGenerator(name = "PizzaGenerator",
            table = "PizzaSequence")
    private int id;

    @Column
    @Enumerated(EnumType.STRING)
    private PizzaType pizzaType;




    @Column(name = "Name")
    private String name;








    @Column(name = "Ingredients")
    @ElementCollection
    private List<IngredientType> ingredients = new ArrayList<> ( );

    public Pizza() {
    }

    public Pizza(PizzaType pizzaType, String name, List<IngredientType> ingredients) {
        this.pizzaType = pizzaType;

        this.name = name;
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IngredientType> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientType> ingredients) {
        this.ingredients = ingredients;
    }










}


