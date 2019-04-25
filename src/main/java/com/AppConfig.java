package com;

import com.sample.repository.HibernateCustomerRepository;
import com.sample.repository.ICustomerRepository;
import com.service.CustomerService;
import com.service.ICustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // class level annotation
@ComponentScan({"com"})/*Implement a scan for autowiring _
and inject them into the project */

public class AppConfig {

    /* method level annotion, to show what this
    instance returns is an instance of a bean and available
    for us to in our Spring application.
     */

    @Bean(name="customerService")// bean naming convention, like a variable
    /*this beans are a singleton and executes the first call and subsequently
    * returns the cached instance */
    public ICustomerServiceImpl getCustomerService() {
        /* Implementing a concretion and returning the interface
        *
           return new CustomerService();*/

       /* CustomerService customerService = new CustomerService();*/

        /*Convert reference into a Constructor injection*/
        CustomerService customerService = new CustomerService(getCustomerRepository());


         //customerService.setCustomerRepository(getCustomerRepository());
         return customerService;
    }

    @Bean(name="customerRepository")
    public ICustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepository();
    }
}
