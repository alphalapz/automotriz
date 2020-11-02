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
import com.citelis.Automotriz.entities.Agencia;
import com.citelis.Automotriz.repository.AgenciaRepository;
import com.citelis.Automotriz.service.AgenciaService;

@Service
public class AgenciaServiceImpl implements AgenciaService {

    private static final String TYPE = "Agencia";

    @Autowired
    AgenciaRepository agenciaRepository;

    @Override
    public List<Agencia> findAllAgencias() {
        return agenciaRepository.findAll();
    }

    @Override
    public Optional<Agencia> findAgenciaById(Long id) {
        Optional<Agencia> agencia = agenciaRepository.findById(id);
        return agencia;
    }

    @Override
    public Agencia saveAgencia(Agencia agenciaNew) {
        if (agenciaNew != null) {
            return agenciaRepository.save(agenciaNew);
        }
        return new Agencia();
    }

    @Override
    public String deleteAgencia(Long id) {
        if (agenciaRepository.findById(id).isPresent()) {
            agenciaRepository.deleteById(id);
            return "Agencia eliminado correctamente.";
        }
        return "Error! El " + TYPE + " no existe";
    }

    @Override
    public String updateAgencia(Agencia agenciaUpdated) {
        Long num = agenciaUpdated.getId();
        if (agenciaRepository.findById(num).isPresent()) {
            Agencia agenciaToUpdate = new Agencia();
            agenciaToUpdate.setId(agenciaUpdated.getId());
            agenciaToUpdate.setName(agenciaUpdated.getName());
            agenciaToUpdate.setDescription(agenciaUpdated.getDescription());

            agenciaRepository.save(agenciaToUpdate);
            return TYPE + " modificado";
        }
        return "Error al modificar el " + TYPE;
    }
}
