package com.service;

import com.sample.repository.ICustomerRepository;
import com.sample_spring.Customer;

import java.util.List;

public class CustomerService implements ICustomerServiceImpl {

    private ICustomerRepository
            customerRepository ;

    public void setCustomerRepository(ICustomerRepository customerRepository){
        this.customerRepository = customerRepository;

    }
    public CustomerService(){

    }
    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();

    }

}
