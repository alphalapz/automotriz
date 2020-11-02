/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.servicelmpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.citelis.Automotriz.entities.Customer;
import com.citelis.Automotriz.repository.CustomerRepository;
import com.citelis.Automotriz.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static final String TYPE = "Customer";

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findCustomerById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer;
    }

    @Override
    public Customer saveCustomer(Customer customerNew) {
        if (customerNew != null) {
            return customerRepository.save(customerNew);
        }
        return new Customer();
    }

    @Override
    public String deleteCustomer(Long id) {
        if (customerRepository.findById(id).isPresent()) {
            customerRepository.deleteById(id);
            return TYPE + " eliminado correctamente.";
        }
        return "Error! El " + TYPE + " no existe";
    }

    @Override
    public String updateCustomer(Customer customerUpdated) {
        Long num = customerUpdated.getId();
        if (customerRepository.findById(num).isPresent()) {
            Customer customerToUpdate = new Customer();
            customerToUpdate.setId(customerUpdated.getId());
            customerToUpdate.setName(customerUpdated.getName());
            customerToUpdate.setSurname(customerUpdated.getSurname());
            customerToUpdate.setBirtdate(customerUpdated.getBirtdate());
            customerToUpdate.setPhone(customerUpdated.getPhone());
            customerToUpdate.setCountry(customerUpdated.getCountry());
            customerToUpdate.setCity(customerUpdated.getCity());
            customerToUpdate.setDirection(customerUpdated.getDirection());
            customerToUpdate.setPostCode(customerUpdated.getPostCode());
            customerRepository.save(customerToUpdate);
            return TYPE + " modificado";
        }
        return "Error al modificar el " + TYPE;
    }
}
