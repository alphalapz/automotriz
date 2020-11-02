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
import com.citelis.Automotriz.entities.Cliente;
import com.citelis.Automotriz.repository.ClienteRepository;
import com.citelis.Automotriz.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    private static final String TYPE = "Cliente";

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findClienteById(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente;
    }

    @Override
    public Cliente saveCliente(Cliente clienterNew) {
        if (clienterNew != null) {
            return clienteRepository.save(clienterNew);
        }
        return new Cliente();
    }

    @Override
    public String deleteCliente(Long id) {
        if (clienteRepository.findById(id).isPresent()) {
            clienteRepository.deleteById(id);
            return TYPE + " eliminado correctamente.";
        }
        return "Error! El " + TYPE + " no existe";
    }

    @Override
    public String updateCliente(Cliente clienteUpdated) {
        Long num = clienteUpdated.getId();
        if (clienteRepository.findById(num).isPresent()) {
            Cliente clienteToUpdate = new Cliente();
            clienteToUpdate.setId(clienteUpdated.getId());
            clienteToUpdate.setName(clienteUpdated.getName());
            clienteToUpdate.setMail(clienteUpdated.getMail());
            clienteToUpdate.setPhone(clienteUpdated.getPhone());

            clienteRepository.save(clienteToUpdate);
            return TYPE + " modificado";
        }
        return "Error al modificar el " + TYPE;
    }
}
