package com.home.pizzaweb.repository;

import com.home.pizzaweb.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository   extends JpaRepository<Pizza, Integer> {
}
