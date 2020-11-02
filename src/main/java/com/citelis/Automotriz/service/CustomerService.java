/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.service;

import java.util.List;
import java.util.Optional;
import com.citelis.Automotriz.entities.Customer;

public interface CustomerService {

    public List<Customer> findAllCustomers();

    public Optional<Customer> findCustomerById(Long id);

    public Customer saveCustomer(Customer customerNew);

    public String deleteCustomer(Long id);

    public String updateCustomer(Customer customerNew);
}
