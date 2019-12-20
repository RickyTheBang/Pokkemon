package com.home.pizzaweb.model;


import com.home.pizzaweb.model.enumType.IngredientType;
import com.home.pizzaweb.model.enumType.PizzaType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "PizzaCreated")
public class PizzaCreated  extends Pizza{

    {
        this.setPizzaType (PizzaType.CREATION);
    }
    public PizzaCreated() {
    }

    public PizzaCreated(PizzaType pizzaType, String name, List<IngredientType> ingredients) {
        super (pizzaType, name, ingredients);
    }

}


