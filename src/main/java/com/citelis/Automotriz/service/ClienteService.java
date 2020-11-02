/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.service;

import java.util.List;
import java.util.Optional;
import com.citelis.Automotriz.entities.Cliente;

public interface ClienteService {

    public List<Cliente> findAllClientes();

    public Optional<Cliente> findClienteById(Long id);

    public Cliente saveCliente(Cliente clienteNew);

    public String deleteCliente(Long id);

    public String updateCliente(Cliente clienteNew);
}
