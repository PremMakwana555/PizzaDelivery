package com.prem.pizzadeliveryapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class UserAddress {

    @Id
    @ManyToOne
    private int customerId;

    private String place;

    private int pincode;


}
