package com.service;

import com.sample_spring.Customer;

import java.util.List;

public interface ICustomerServiceImpl {
    List<Customer> findAll();
}
