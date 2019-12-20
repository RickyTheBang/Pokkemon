package com.home.pizzaweb.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
/*@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)*/
@Table(name = "OrderPizza")
public class OrderPizza {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;

    @Column(name="DeliveryName")
    private String deliveryName;

    @Column(name="PlacedAt")
    private Date placedAt;

    @ManyToMany(targetEntity=Pizza.class)
    private List<Pizza> pizzas = new ArrayList<> ();



    public OrderPizza() {
    }

    public int getId() {
        return id;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public Date getPlacedAt() {
        return placedAt;
    }

    public void setPlacedAt(Date placedAt) {
        this.placedAt = placedAt;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    @PrePersist
    void placedAt() {
        this.placedAt = new Date ();
    }


    @Override
    public String toString() {
        return "OrderPizza{" +
                "id=" + id +
                ", name='" + deliveryName + '\'' +
                ", placedAt=" + placedAt +
                ", pizzas=" + pizzas +
                '}';
    }
}
