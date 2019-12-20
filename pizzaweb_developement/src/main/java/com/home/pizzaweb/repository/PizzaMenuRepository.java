package com.home.pizzaweb.repository;

import com.home.pizzaweb.model.PizzaMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface PizzaMenuRepository extends JpaRepository<PizzaMenu, Integer> {

    @Transactional
    PizzaMenu findPizzaMenuById(int id);


}
