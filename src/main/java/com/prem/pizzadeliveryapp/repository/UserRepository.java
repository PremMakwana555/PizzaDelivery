package com.prem.pizzadeliveryapp.repository;

import com.prem.pizzadeliveryapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Customer, Integer> {
}
