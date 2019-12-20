package com.home.pizzaweb.model;

import com.home.pizzaweb.model.enumType.CompositionType;
import com.home.pizzaweb.model.enumType.IngredientType;
import com.home.pizzaweb.model.enumType.UnitType;

import javax.persistence.*;


/*


Margherita: tomato sauce, mozzarella
Funghi: tomato sauce, mozzarella, mushrooms
Capricciosa: tomato sauce, mozzarella, mushrooms, ham, eggs, artichoke, cocktail sausages, green olives
Quattro Stagioni: tomato sauce, mozzarella, ham, black olives, mushrooms, artichoke, peas, salami, eggs
Vegetariana: tomato sauce, mozzarella, mushrooms, onion, (artichoke), sweet corn, green peppers,
Quattro Formaggi: tomato sauce, and 4 assorted cheeses, generally mozzarella, Parmesan cheese, blue cheese, and goat cheese, but may vary
Marinara: tomato sauce, mozzarella, shrimps, mussels, tuna, calamari, crab meat
Peperoni: tomato sauce, mozzarella, peperoni
Napolitana: tomato sauce, anchovies, olives, capers
Hawaii: tomato sauce, mozzarella, ham, pineapple
Maltija (Maltese): tomato sauce, goat cheese, sun dried tomatoes, Maltese sausage, onion
Calzone (folded): tomato sauce, mozzarella, mushrooms, ham, eggs,
Rucola: tomato sauce, mozzarella di bufala, parma ham, Parmesan shavings, rucola
 */

@Entity
@Table(name= "Ingredients")
 public class Ingredient {

    @Id
    @Enumerated(EnumType.STRING)
    private IngredientType id;
    @Column(name = "Name")
    private String name;


    @Column(name = "ExpensesPrice")
    private double expensesPrice;
    @Column(name = "IncomePrice")
    private double incomePrice;

    @Column(name = "Quantity")
    private double quantity;

    @Enumerated(EnumType.STRING)
    private CompositionType compositionType;


   @Enumerated(EnumType.STRING)
    private UnitType unitType;

    public Ingredient() {
    }

    public Ingredient(IngredientType id, String name, double expensesPrice, double incomePrice, double quantity,CompositionType compositionType, UnitType unitType) {
        this.id = id;
        this.name = name;
        this.expensesPrice = expensesPrice;
        this.incomePrice = incomePrice;
        this.quantity = quantity;
        this.compositionType = compositionType;
        this.unitType = unitType;
    }

    public IngredientType getId() {
        return id;
    }

    public void setId(IngredientType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

   /* public String getName(IngredientType ingredientType) {
        if(this.id== ingredientType){
            return name;
        }

       else return null;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public double getExpensesPrice() {
        return expensesPrice;
    }

    public void setExpensesPrice(double expensesPrice) {
        this.expensesPrice = expensesPrice;
    }

    public double getIncomePrice() {
        return incomePrice;
    }

    public void setIncomePrice(double incomePrice) {
        this.incomePrice = incomePrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public CompositionType getCompositionType() {
        return compositionType;
    }

    public void setCompositionType(CompositionType compositionType) {
        this.compositionType = compositionType;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }


    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expensesPrice=" + expensesPrice +
                ", incomePrice=" + incomePrice +
                ", quantity=" + quantity +
                ", compositionType=" + compositionType +
                ", unitType=" + unitType +
                '}';
    }
}