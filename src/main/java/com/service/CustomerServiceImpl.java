package com.service;

import com.sample.repository.HibernateCustomerRepositoryImpl;
import com.sample.repository.ICustomerRepository;
import com.sample_spring.Customer;

import java.util.List;

public class CustomerServiceImpl implements ICustomerServiceImpl {

    private ICustomerRepository
            customerRepository = new HibernateCustomerRepositoryImpl();

    /*Business logic resides here*/

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll(); /* this does not have to be hard coded*/

    }

}
