package com.home.pizzaweb.repository;

import com.home.pizzaweb.model.OrderPizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderPizza, Integer> {



    
}
