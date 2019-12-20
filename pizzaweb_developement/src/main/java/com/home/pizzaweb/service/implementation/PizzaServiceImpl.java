package com.home.pizzaweb.service.implementation;

import com.home.pizzaweb.model.enumType.IngredientType;
import com.home.pizzaweb.service.PizzaService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Override
    public String writeIngredientString(List<IngredientType> ingredientTypes) {

        StringBuilder ingredientsShort = new StringBuilder ( );
        String ingredientsString="";
        List<IngredientType> ingredientTypeList = ingredientTypes.stream ( )
                .filter (i -> i != IngredientType.CLASSIC_DOUGH)
                .collect (Collectors.toList ( ));
        for (int i = 0; i < ingredientTypeList.size ( ); i++) {
            StringBuilder ingredient = new StringBuilder (ingredientTypeList.get (i).toString ( ));
            int index = 0;
            while (index != -1) {
                index = ingredient.indexOf ("_");
                if (index != -1) {
                    ingredient.replace (index, index + 1, " ");
                }
            }
            ingredientsShort.append (ingredient + ", ");
        }

        if(ingredientsShort.length ()!=0){
            ingredientsString = ingredientsShort.substring (0, ingredientsShort.length ( ) - 2);
        }

        return "Ingredients: ".concat (ingredientsString.toLowerCase ( ));



    }






}
