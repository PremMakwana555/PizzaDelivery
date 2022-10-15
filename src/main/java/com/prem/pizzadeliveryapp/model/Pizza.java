package com.prem.pizzadeliveryapp.model;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Pizza {

    @Id
    private int pizzaId;

    private String name;

    private String crust;

    private List<String> toppings;

    private String size;

    private int price;
}
