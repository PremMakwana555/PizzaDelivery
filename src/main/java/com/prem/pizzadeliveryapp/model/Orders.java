package com.prem.pizzadeliveryapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Orders {

    @Id
    private int orderId;

    @OneToOne
    private int CustomerId;

    private List<Pizza> pizzas;

    private int quantity;



}
