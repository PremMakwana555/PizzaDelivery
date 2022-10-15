package com.prem.pizzadeliveryapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column(name = "name")
    private String customerName;

    @Column(unique = true)
    private int number;

    @Column(unique = true)
    private String email;

    @OneToMany
    private int userAddressId;

    private int cartId;


}
