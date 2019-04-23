package com.service;

import com.sample.repository.HibernateCustomerRepository;
import com.sample.repository.ICustomerRepository;
import com.sample_spring.Customer;

import java.util.List;

public class CustomerService implements ICustomerServiceImpl {

    private ICustomerRepository
            customerRepository = new HibernateCustomerRepository();

    /*Business logic resides here*/

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll(); /* this does not have to be hard coded*/

    }

}
