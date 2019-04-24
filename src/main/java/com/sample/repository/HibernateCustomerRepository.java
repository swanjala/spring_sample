package com.sample.repository;

import com.sample_spring.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepository implements ICustomerRepository{

    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();

        /* default implementation*/

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customers.add(customer);

        return  customers;
    }

}
