package com.home.pizzaweb.component;

import com.home.pizzaweb.model.PizzaMenu;
import com.home.pizzaweb.model.enumType.IngredientType;
import com.home.pizzaweb.model.enumType.PizzaType;
import com.home.pizzaweb.repository.PizzaMenuRepository;
import com.home.pizzaweb.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
//@Scope(value = "prototype",proxyMode = ScopedProxyMode.INTERFACES)

// Class to fill in the table PizzaMenu with its specific components
public class PizzaMenuComponent extends PizzaMenu {


    private PizzaMenuRepository pizzaMenuRepository;

    private PizzaService pizzaService;

    @Autowired
    public void setPizzaService(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @Autowired
    public void setPizzaMenuRepository(PizzaMenuRepository pizzaMenuRepository) {
        this.pizzaMenuRepository = pizzaMenuRepository;
    }


    // private String pizzaTypeString;

    public PizzaMenuComponent() {
    }

    public PizzaMenuComponent(PizzaMenuComponent pizzaMenuComponent) {


    }

    public void setParameters(int id) {
        this.setId(id);
        PizzaMenu currentPizzaMenu = pizzaMenuRepository.findPizzaMenuById(id);


        this.setName(currentPizzaMenu.getName());
        this.setPizzaType(currentPizzaMenu.getPizzaType());
        this.setIngredients(currentPizzaMenu.getIngredients());

        this.setPizzaTypeString();
        this.setIngredientString(currentPizzaMenu.getIngredientString());





    }


    @Override
    public void setIngredientString(String ingredientString) {
        super.setIngredientString(pizzaService.writeIngredientString(this.getIngredients()));

    }


}