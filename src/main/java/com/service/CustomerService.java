package com.service;

import com.sample.repository.ICustomerRepository;
import com.sample_spring.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerService implements ICustomerServiceImpl {

   // @Autowired (member injection)
    private ICustomerRepository
            customerRepository ;

  //  @Autowired //setter injection
    public void setCustomerRepository(ICustomerRepository customerRepository){
        this.customerRepository = customerRepository;

    }
//    public CustomerService(){
//
//    }
//
//    @Autowired //Constructor injection
//    public CustomerService(ICustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();

    }

}
