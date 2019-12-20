package com.home.pizzaweb.repository;


import com.home.pizzaweb.model.Ingredient;
import com.home.pizzaweb.model.enumType.IngredientType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;


public interface IngredientRepository extends JpaRepository<Ingredient, IngredientType> {

    @Transactional
    Ingredient findIngredientById(IngredientType ingredientType);

  /*  default Ingredient getIngredientByTypeId(IngredientType id) {
        return findById(id).orElse(null);
    }*/


/*

    @Transactional
    @Query(value = "select pt from PokkemonType  pt where pt.typeName=?1")
    public PokkemonType getPokkemonByTypeName(String typeName);

    default void savePokkemonType(PokkemonType pokemonType) {

       save(pokemonType);
    }

    @Transactional
    @Query(value = "select pt from PokkemonType  pt")
    public   List<PokkemonType> getAllPokkemonType();


    @Transactional
    @Query(value = "select pt.typeName from PokkemonType  pt")
    public   List<String> getAllPokkemonTypeName();

    @Transactional
    @Modifying
    @Query(name ="PokkemonType_delete")
    public void deleteAllPokkemonType();



*/


}
