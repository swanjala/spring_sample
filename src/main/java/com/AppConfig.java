package com;

import com.sample.repository.ICustomerRepository;
import com.service.CustomerService;
import com.service.ICustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // class level annotation
public class AppConfig {

    /* method level annotion, to show what this
    instance returns is an instance of a bean and available
    for us to in our Spring application.
     */

    @Bean(name="customerService")// bean naming convention, like a variable
    public ICustomerServiceImpl getCustomerService() {
        /* Implementing a concretion and returning the interface
        * */
        return new CustomerService();
    }
}
