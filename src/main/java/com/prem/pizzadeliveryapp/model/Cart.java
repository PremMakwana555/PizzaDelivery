package com.prem.pizzadeliveryapp.model;

import java.math.BigDecimal;

public class Cart implements CartItem{

    private int totalAmount;

    private int customerId;


    @Override
    public String getname() {
        return null;
    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }
}
