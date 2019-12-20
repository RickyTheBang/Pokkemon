package com.home.pizzaweb.model;


import com.home.pizzaweb.model.enumType.IngredientType;
import com.home.pizzaweb.model.enumType.PizzaType;
import com.home.pizzaweb.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import java.util.ArrayList;
import java.util.List;

@Entity
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Table(name = "PizzaMenu", uniqueConstraints = {@UniqueConstraint(columnNames = "pizzaType")})
public class PizzaMenu extends Pizza {


    private String pizzaTypeString;

    private String ingredientString;


    public PizzaMenu() {
    }

    public PizzaMenu(PizzaType pizzaType, String name, List<IngredientType> ingredients) {
        super (pizzaType, name, ingredients);
    }

    public String getPizzaTypeString() {
        return pizzaTypeString;
    }


    //No parameter required. The setter use an internal field.
    public void setPizzaTypeString() {
        this.pizzaTypeString =  this.getPizzaType ( ).name ( );
    }
    public String getIngredientString() {
        return ingredientString;
    }

    public void setIngredientString(String ingredientString) {
        this.ingredientString = ingredientString;
    }


    @Override
    public String toString() {
        return "PizzaMenu{" +
                "pizzaTypeString='" + pizzaTypeString + '\'' +
                ", ingredientString='" + ingredientString + '\'' +
                "} " + super.toString();
    }
}


