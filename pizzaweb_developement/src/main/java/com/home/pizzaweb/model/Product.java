package com.home.pizzaweb.model;

import com.home.pizzaweb.model.enumType.IngredientType;
import com.home.pizzaweb.model.enumType.PizzaType;

import java.util.List;

public interface Product {


    public int getId();

    public void setId(int id);

    public PizzaType getPizzaType();

    public void setPizzaType(PizzaType pizzaType);


    public String getName();

    public void setName(String name);

    public List<IngredientType> getIngredients();

    public void setIngredients(List<IngredientType> ingredients);
}
