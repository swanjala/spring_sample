package com.sample.repository;

import com.sample_spring.Customer;

import java.util.List;

public interface ICustomerRepository {

    List<Customer> findAll();
}
