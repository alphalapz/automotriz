/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.controllers;

import java.util.List;
import java.util.Optional;

import com.citelis.Automotriz.entities.Cliente;

public interface ClienteController {

    public List<Cliente> getClientes();

    public Optional<Cliente> getClienteById(Long id);

    public Cliente addCliente(Cliente cliente);

    public String deleteCliente(Long id);

    public String updateCliente(Cliente clienteNew);

}
