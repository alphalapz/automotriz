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

import com.citelis.Automotriz.controllers.ClienteController;
import com.citelis.Automotriz.entities.Cliente;
import com.citelis.Automotriz.service.ClienteService;

@RestController
public class ClienteControllerImpl implements ClienteController {

    @Autowired
    ClienteService clienteService;

    // http://localhost:8080/clientes (GET)
    @RequestMapping(value = "/clientes", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Cliente> getClientes() {
        return clienteService.findAllClientes();
    }

    // http://localhost:8080/clientes/1 (GET)
    @Override
    @RequestMapping(value = "/cliente/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Cliente> getClienteById(@PathVariable Long id) {
        return clienteService.findClienteById(id);
    }

    // http://localhost:8080/clientes/add (ADD)
    @Override
    @RequestMapping(value = "/clientes/add", method = RequestMethod.POST, produces = "application/json")
    public Cliente addCliente(Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    // http://localhost:8080/clientes/delete/1 (GET)
    @Override
    @RequestMapping(value = "/clientes/delete/{id}", method = RequestMethod.GET, produces = "application/json")
    public String deleteCliente(@PathVariable Long id) {
        return clienteService.deleteCliente(id);
    }

    // http://localhost:8080/clientes/update (PATCH)
    @Override
    @RequestMapping(value = "/clientes/update", method = RequestMethod.PATCH, produces = "application/json")
    public String updateCliente(Cliente clienteNew) {
        return clienteService.updateCliente(clienteNew);
    }
}
