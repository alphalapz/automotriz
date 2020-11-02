/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.controllerslmpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citelis.Automotriz.controllers.CustomerController;
import com.citelis.Automotriz.entities.Customer;
import com.citelis.Automotriz.service.CustomerService;

@RestController
public class CustomerControllerImpl implements CustomerController {

    @Autowired
    CustomerService customerService;

    // http://localhost:8080/customers (GET)
    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Customer> getCustomers() {
        return customerService.findAllCustomers();
    }

    // http://localhost:8080/customers/1 (GET)
    @Override
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }

    // http://localhost:8080/customers/add (ADD)
    @Override
    @RequestMapping(value = "/customers/add", method = RequestMethod.POST, produces = "application/json")
    public Customer addCustomer(Customer customer) {
        return customerService.saveCustomer(customer);
    }

    // http://localhost:8080/customers/delete/1 (GET)
    @Override
    @RequestMapping(value = "/customers/delete/{id}", method = RequestMethod.GET, produces = "application/json")
    public String deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }

    // http://localhost:8080/customers/update (PATCH)
    @Override
    @RequestMapping(value = "/customers/update", method = RequestMethod.PATCH, produces = "application/json")
    public String updateCustomer(Customer customerNew) {
        return customerService.updateCustomer(customerNew);
    }

    // http://localhost:8080/test (GET)
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    @Override
    public String test() {
        return "Hola mundo!";
    }
}
