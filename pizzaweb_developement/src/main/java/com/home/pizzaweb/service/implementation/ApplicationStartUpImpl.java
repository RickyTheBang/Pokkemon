package com.home.pizzaweb.service.implementation;

import com.home.pizzaweb.model.Ingredient;
import com.home.pizzaweb.model.PizzaMenu;
import com.home.pizzaweb.model.enumType.CompositionType;
import com.home.pizzaweb.model.enumType.IngredientType;
import com.home.pizzaweb.model.enumType.PizzaType;
import com.home.pizzaweb.model.enumType.UnitType;
import com.home.pizzaweb.repository.IngredientRepository;
import com.home.pizzaweb.repository.PizzaMenuRepository;
import com.home.pizzaweb.service.ApplicationStartUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationStartUpImpl implements ApplicationStartUp {


    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private PizzaMenuRepository pizzaMenuRepository;


    @Override
    public void init() {
        updateIngredientTable();
        updatePizzaTable();
    }


    @Override
    public void updateIngredientTable() {


        Ingredient CLASSIC_DOUGH = new Ingredient(IngredientType.CLASSIC_DOUGH,"classic dough",3.1,12.41,0.5,CompositionType.DOUGH,UnitType.KILO);
        Ingredient NEW_YORK_DOUGH = new Ingredient(IngredientType.NEW_YORK_DOUGH,"New York dough",3.15,12.6,0.5,CompositionType.DOUGH,UnitType.KILO);
        Ingredient NEAPOLITAN_DOUGH = new Ingredient(IngredientType.NEAPOLITAN_DOUGH,"Neapolitan dough",3.19,12.74,0.5,CompositionType.DOUGH,UnitType.KILO);
        Ingredient SICILIAN_DOUGH = new Ingredient(IngredientType.SICILIAN_DOUGH,"Sicilian dough",3.25,12.98,0.5,CompositionType.DOUGH,UnitType.KILO);
        Ingredient BLUE_CHEESE = new Ingredient(IngredientType.BLUE_CHEESE,"blue cheese",14.35,57.4,0.13,CompositionType.CHEESE,UnitType.KILO);
        Ingredient CHEDDAR_CHEESE = new Ingredient(IngredientType.CHEDDAR_CHEESE,"cheddar cheese",2.06,8.25,0.13,CompositionType.CHEESE,UnitType.KILO);
        Ingredient FONTINA_CHEESE = new Ingredient(IngredientType.FONTINA_CHEESE,"fontina cheese",2.75,11,0.13,CompositionType.CHEESE,UnitType.KILO);
        Ingredient GOAT_CHEESE = new Ingredient(IngredientType.GOAT_CHEESE,"goat cheese",2.06,8.25,0.13,CompositionType.CHEESE,UnitType.KILO);
        Ingredient MOZZARELLA_CHEESE = new Ingredient(IngredientType.MOZZARELLA_CHEESE,"mozzarella cheese",2.41,9.63,0.13,CompositionType.CHEESE,UnitType.KILO);
        Ingredient MOZZARELLA_DI_BUFALA = new Ingredient(IngredientType.MOZZARELLA_DI_BUFALA,"mozzarella di bufala",2.89,11.55,0.13,CompositionType.CHEESE,UnitType.KILO);
        Ingredient PARMESAN_CHEESE = new Ingredient(IngredientType.PARMESAN_CHEESE,"Parmesan cheese",4.73,18.92,0.3,CompositionType.CHEESE,UnitType.KILO);
        Ingredient ANCHOVIES = new Ingredient(IngredientType.ANCHOVIES,"anchovies",8.91,35.64,0.05,CompositionType.FISH,UnitType.KILO);
        Ingredient CALAMARI = new Ingredient(IngredientType.CALAMARI,"calamari",3.96,15.84,0.2,CompositionType.FISH,UnitType.KILO);
        Ingredient CRAB_MEAT = new Ingredient(IngredientType.CRAB_MEAT,"crab meat",18.48,73.92,0.15,CompositionType.FISH,UnitType.KILO);
        Ingredient MUSSELS = new Ingredient(IngredientType.MUSSELS,"mussels",19.33,77.33,0.3,CompositionType.FISH,UnitType.KILO);
        Ingredient SHRIMPS = new Ingredient(IngredientType.SHRIMPS,"shrimps",25.3,101.2,0.3,CompositionType.FISH,UnitType.KILO);
        Ingredient TUNA = new Ingredient(IngredientType.TUNA,"tuna",7.92,31.68,0.2,CompositionType.FISH,UnitType.KILO);
        Ingredient COCKTAIL_SAUSAGES = new Ingredient(IngredientType.COCKTAIL_SAUSAGES,"cocktail sausages",1.76,7.04,0.2,CompositionType.MEAT,UnitType.KILO);
        Ingredient EGGS = new Ingredient(IngredientType.EGGS,"eggs",0.1,0.4,1,CompositionType.MEAT,UnitType.PIECE);
        Ingredient HAM = new Ingredient(IngredientType.HAM,"ham",2.2,8.8,0.3,CompositionType.MEAT,UnitType.KILO);
        Ingredient MALTESE_SAUSAGE = new Ingredient(IngredientType.MALTESE_SAUSAGE,"Maltese sausage",3.3,13.2,0.25,CompositionType.MEAT,UnitType.KILO);
        Ingredient PARMA_HAM = new Ingredient(IngredientType.PARMA_HAM,"parma ham",36.67,146.67,0.3,CompositionType.MEAT,UnitType.KILO);
        Ingredient PEPERONI = new Ingredient(IngredientType.PEPERONI,"peperoni",10.89,43.56,0.2,CompositionType.MEAT,UnitType.KILO);
        Ingredient SALAMI = new Ingredient(IngredientType.SALAMI,"salami",10.12,40.48,0.3,CompositionType.MEAT,UnitType.KILO);
        Ingredient TOMATO_SAUCE = new Ingredient(IngredientType.TOMATO_SAUCE,"tomato sauce",0.62,2.46,0.24,CompositionType.SAUCE,UnitType.LITER);
        Ingredient TOMATO_SPICY_SAUCE = new Ingredient(IngredientType.TOMATO_SPICY_SAUCE,"tomato spicy sauce",0.66,2.64,0.24,CompositionType.SAUCE,UnitType.LITER);
        Ingredient TOMATO_GARLIC_SAUCE = new Ingredient(IngredientType.TOMATO_GARLIC_SAUCE,"tomato garlic sauce",0.7,2.82,0.24,CompositionType.SAUCE,UnitType.LITER);
        Ingredient ARTICHOKE = new Ingredient(IngredientType.ARTICHOKE,"artichoke",1.95,7.79,0.1,CompositionType.VEGETABLE,UnitType.KILO);
        Ingredient BLACK_OLIVES = new Ingredient(IngredientType.BLACK_OLIVES,"black olives",2.75,11,0.08,CompositionType.TOPPING,UnitType.KILO);
        Ingredient CAPERS = new Ingredient(IngredientType.CAPERS,"capers",52.58,210.32,0.02,CompositionType.TOPPING,UnitType.KILO);
        Ingredient GREEN_OLIVES = new Ingredient(IngredientType.GREEN_OLIVES,"green olives",2.64,10.56,0.07,CompositionType.TOPPING,UnitType.KILO);
        Ingredient GREEN_PEPPERS = new Ingredient(IngredientType.GREEN_PEPPERS,"green peppers",0.17,0.69,0.3,CompositionType.TOPPING,UnitType.PIECE);
        Ingredient MUSHROOMS = new Ingredient(IngredientType.MUSHROOMS,"mushrooms",10.31,41.25,0.1,CompositionType.VEGETABLE,UnitType.KILO);
        Ingredient ONION = new Ingredient(IngredientType.ONION,"onion",7.11,28.45,0.13,CompositionType.VEGETABLE,UnitType.KILO);
        Ingredient PARMESAN_SHAVINGS = new Ingredient(IngredientType.PARMESAN_SHAVINGS,"Parmesan shavings",3.25,12.98,0.13,CompositionType.TOPPING,UnitType.KILO);
        Ingredient PEAS = new Ingredient(IngredientType.PEAS,"peas",3.64,14.55,0.2,CompositionType.VEGETABLE,UnitType.KILO);
        Ingredient RUCOLA = new Ingredient(IngredientType.RUCOLA,"rucola",10.34,41.36,0.1,CompositionType.VEGETABLE,UnitType.KILO);
        Ingredient SUN_DRIED_TOMATOES = new Ingredient(IngredientType.SUN_DRIED_TOMATOES,"sun dried tomatoes",7.33,29.33,0.2,CompositionType.VEGETABLE,UnitType.KILO);
        Ingredient SWEET_CORN = new Ingredient(IngredientType.SWEET_CORN,"sweet corn",0.77,3.08,0.1,CompositionType.VEGETABLE,UnitType.KILO);







        ingredientRepository.save(CLASSIC_DOUGH);
        ingredientRepository.save(NEW_YORK_DOUGH);
        ingredientRepository.save(NEAPOLITAN_DOUGH);
        ingredientRepository.save(SICILIAN_DOUGH);
        ingredientRepository.save(BLUE_CHEESE);
        ingredientRepository.save(CHEDDAR_CHEESE);
        ingredientRepository.save(FONTINA_CHEESE);
        ingredientRepository.save(GOAT_CHEESE);
        ingredientRepository.save(MOZZARELLA_CHEESE);
        ingredientRepository.save(MOZZARELLA_DI_BUFALA);
        ingredientRepository.save(PARMESAN_CHEESE);
        ingredientRepository.save(ANCHOVIES);
        ingredientRepository.save(CALAMARI);
        ingredientRepository.save(CRAB_MEAT);
        ingredientRepository.save(MUSSELS);
        ingredientRepository.save(SHRIMPS);
        ingredientRepository.save(TUNA);
        ingredientRepository.save(COCKTAIL_SAUSAGES);
        ingredientRepository.save(EGGS);
        ingredientRepository.save(HAM);
        ingredientRepository.save(MALTESE_SAUSAGE);
        ingredientRepository.save(PARMA_HAM);
        ingredientRepository.save(PEPERONI);
        ingredientRepository.save(SALAMI);
        ingredientRepository.save(TOMATO_SAUCE);
        ingredientRepository.save(TOMATO_SPICY_SAUCE);
        ingredientRepository.save(TOMATO_GARLIC_SAUCE);
        ingredientRepository.save(ARTICHOKE);
        ingredientRepository.save(BLACK_OLIVES);
        ingredientRepository.save(CAPERS);
        ingredientRepository.save(GREEN_OLIVES);
        ingredientRepository.save(GREEN_PEPPERS);
        ingredientRepository.save(MUSHROOMS);
        ingredientRepository.save(ONION);
        ingredientRepository.save(PARMESAN_SHAVINGS);
        ingredientRepository.save(PEAS);
        ingredientRepository.save(RUCOLA);
        ingredientRepository.save(SUN_DRIED_TOMATOES);
        ingredientRepository.save(SWEET_CORN);


    }

    @Override
    public void updatePizzaTable() {


        List<IngredientType> theList = new ArrayList<>();
        IngredientType[] it = {IngredientType.CLASSIC_DOUGH, IngredientType.TOMATO_SAUCE};


        List<IngredientType> MARGHERITA_List = new ArrayList<>();
        List<IngredientType> FUNGHI_List = new ArrayList<>();
        List<IngredientType> CAPRICCIOSA_List = new ArrayList<>();
        List<IngredientType> QUATTRO_STAGIONI_List = new ArrayList<>();
        List<IngredientType> VEGETARIANA_List = new ArrayList<>();
        List<IngredientType> QUATTRO_FORMAGGI_List = new ArrayList<>();
        List<IngredientType> MARINARA_List = new ArrayList<>();
        List<IngredientType> PEPERONI_List = new ArrayList<>();
      /*  List<IngredientType> NAPOLITANA_List = new ArrayList<>();
        List<IngredientType> MALTESE_List = new ArrayList<>();
        List<IngredientType> RUCOLA_List = new ArrayList<>();*/


        MARGHERITA_List.add(IngredientType.CLASSIC_DOUGH);
        MARGHERITA_List.add(IngredientType.MOZZARELLA_CHEESE);
        MARGHERITA_List.add(IngredientType.TOMATO_SAUCE);
        FUNGHI_List.add(IngredientType.CLASSIC_DOUGH);
        FUNGHI_List.add(IngredientType.MOZZARELLA_CHEESE);
        FUNGHI_List.add(IngredientType.MUSHROOMS);
        FUNGHI_List.add(IngredientType.TOMATO_SAUCE);
        CAPRICCIOSA_List.add(IngredientType.ARTICHOKE);
        CAPRICCIOSA_List.add(IngredientType.CLASSIC_DOUGH);
        CAPRICCIOSA_List.add(IngredientType.COCKTAIL_SAUSAGES);
        CAPRICCIOSA_List.add(IngredientType.EGGS);
        CAPRICCIOSA_List.add(IngredientType.GREEN_OLIVES);
        CAPRICCIOSA_List.add(IngredientType.HAM);
        CAPRICCIOSA_List.add(IngredientType.MOZZARELLA_CHEESE);
        CAPRICCIOSA_List.add(IngredientType.MOZZARELLA_DI_BUFALA);
        CAPRICCIOSA_List.add(IngredientType.MUSHROOMS);
        CAPRICCIOSA_List.add(IngredientType.TOMATO_SAUCE);
        QUATTRO_STAGIONI_List.add(IngredientType.ARTICHOKE);
        QUATTRO_STAGIONI_List.add(IngredientType.BLACK_OLIVES);
        QUATTRO_STAGIONI_List.add(IngredientType.CLASSIC_DOUGH);
        QUATTRO_STAGIONI_List.add(IngredientType.EGGS);
        QUATTRO_STAGIONI_List.add(IngredientType.HAM);
        QUATTRO_STAGIONI_List.add(IngredientType.MOZZARELLA_CHEESE);
        QUATTRO_STAGIONI_List.add(IngredientType.MUSHROOMS);
        QUATTRO_STAGIONI_List.add(IngredientType.PEAS);
        QUATTRO_STAGIONI_List.add(IngredientType.SALAMI);
        VEGETARIANA_List.add(IngredientType.ARTICHOKE);
        VEGETARIANA_List.add(IngredientType.CLASSIC_DOUGH);
        VEGETARIANA_List.add(IngredientType.GREEN_PEPPERS);
        VEGETARIANA_List.add(IngredientType.MOZZARELLA_CHEESE);
        VEGETARIANA_List.add(IngredientType.MUSHROOMS);
        VEGETARIANA_List.add(IngredientType.ONION);
        VEGETARIANA_List.add(IngredientType.SWEET_CORN);
        VEGETARIANA_List.add(IngredientType.TOMATO_SAUCE);
        QUATTRO_FORMAGGI_List.add(IngredientType.CALAMARI);
        QUATTRO_FORMAGGI_List.add(IngredientType.CLASSIC_DOUGH);
        QUATTRO_FORMAGGI_List.add(IngredientType.COCKTAIL_SAUSAGES);
        QUATTRO_FORMAGGI_List.add(IngredientType.MOZZARELLA_CHEESE);
        QUATTRO_FORMAGGI_List.add(IngredientType.MUSSELS);
        QUATTRO_FORMAGGI_List.add(IngredientType.SHRIMPS);
        QUATTRO_FORMAGGI_List.add(IngredientType.TOMATO_SAUCE);
        QUATTRO_FORMAGGI_List.add(IngredientType.TUNA);
        MARINARA_List.add(IngredientType.CALAMARI);
        MARINARA_List.add(IngredientType.CLASSIC_DOUGH);
        MARINARA_List.add(IngredientType.CRAB_MEAT);
        MARINARA_List.add(IngredientType.MOZZARELLA_CHEESE);
        MARINARA_List.add(IngredientType.MUSSELS);
        MARINARA_List.add(IngredientType.SHRIMPS);
        MARINARA_List.add(IngredientType.TOMATO_SAUCE);
        MARINARA_List.add(IngredientType.TUNA);
        PEPERONI_List.add(IngredientType.CLASSIC_DOUGH);
        PEPERONI_List.add(IngredientType.MOZZARELLA_CHEESE);
        PEPERONI_List.add(IngredientType.PEPERONI);
        PEPERONI_List.add(IngredientType.TOMATO_SAUCE);
       /* NAPOLITANA_List.add(IngredientType.ANCHOVIES);
        NAPOLITANA_List.add(IngredientType.BLACK_OLIVES);
        NAPOLITANA_List.add(IngredientType.CAPERS);
        NAPOLITANA_List.add(IngredientType.CLASSIC_DOUGH);
        NAPOLITANA_List.add(IngredientType.GREEN_OLIVES);
        NAPOLITANA_List.add(IngredientType.MOZZARELLA_CHEESE);
        NAPOLITANA_List.add(IngredientType.TOMATO_SAUCE);
        MALTESE_List.add(IngredientType.CLASSIC_DOUGH);
        MALTESE_List.add(IngredientType.GOAT_CHEESE);
        MALTESE_List.add(IngredientType.MALTESE_SAUSAGE);
        MALTESE_List.add(IngredientType.ONION);
        MALTESE_List.add(IngredientType.SUN_DRIED_TOMATOES);
        MALTESE_List.add(IngredientType.TOMATO_SAUCE);
        RUCOLA_List.add(IngredientType.CLASSIC_DOUGH);
        RUCOLA_List.add(IngredientType.MOZZARELLA_CHEESE);
        RUCOLA_List.add(IngredientType.PARMA_HAM);
        RUCOLA_List.add(IngredientType.PARMESAN_CHEESE);
        RUCOLA_List.add(IngredientType.RUCOLA);
        RUCOLA_List.add(IngredientType.TOMATO_SAUCE);*/




        PizzaMenu MARGHERITA = new PizzaMenu(PizzaType.MARGHERITA, "Margherita", MARGHERITA_List);
        PizzaMenu FUNGHI = new PizzaMenu(PizzaType.FUNGHI, "Funghi", FUNGHI_List);
        PizzaMenu CAPRICCIOSA = new PizzaMenu(PizzaType.CAPRICCIOSA, "Capricciosa", CAPRICCIOSA_List);
        PizzaMenu QUATTRO_STAGIONI = new PizzaMenu(PizzaType.QUATTRO_STAGIONI, "Quattro stagioni", QUATTRO_STAGIONI_List);
        PizzaMenu VEGETARIANA = new PizzaMenu(PizzaType.VEGETARIANA, "Vegetariana", VEGETARIANA_List);
        PizzaMenu QUATTRO_FORMAGGI = new PizzaMenu(PizzaType.QUATTRO_FORMAGGI, "Quattro formaggi", QUATTRO_FORMAGGI_List);
        PizzaMenu MARINARA = new PizzaMenu(PizzaType.MARINARA, "Marinara", MARINARA_List);
        PizzaMenu PEPERONI = new PizzaMenu(PizzaType.PEPERONI, "Peperoni", PEPERONI_List);
       /* PizzaMenu NAPOLITANA = new PizzaMenu(PizzaType.NAPOLITANA, "Napolitana", NAPOLITANA_List);
        PizzaMenu MALTESE = new PizzaMenu(PizzaType.MALTESE, "Maltese", MALTESE_List);
        PizzaMenu RUCOLA = new PizzaMenu(PizzaType.RUCOLA, "Rucola", RUCOLA_List);
*/

        try {


            pizzaMenuRepository.save(MARGHERITA);
            pizzaMenuRepository.save(FUNGHI);
            pizzaMenuRepository.save(CAPRICCIOSA);
            pizzaMenuRepository.save(QUATTRO_STAGIONI);
            pizzaMenuRepository.save(VEGETARIANA);
            pizzaMenuRepository.save(QUATTRO_FORMAGGI);
            pizzaMenuRepository.save(MARINARA);
            pizzaMenuRepository.save(PEPERONI);
          /*  pizzaMenuRepository.save(NAPOLITANA);
            pizzaMenuRepository.save(MALTESE);
            pizzaMenuRepository.save(RUCOLA);*/

        } catch (Exception e) {
            System.out.println("already in the table");
        }
    }

}


