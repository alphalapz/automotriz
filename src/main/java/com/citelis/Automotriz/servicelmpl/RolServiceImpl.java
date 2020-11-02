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
import com.citelis.Automotriz.entities.Rol;
import com.citelis.Automotriz.repository.RolRepository;
import com.citelis.Automotriz.service.RolService;

@Service
public class RolServiceImpl implements RolService {

    private static final String TYPE = "Rol";

    @Autowired
    RolRepository rolRepository;

    @Override
    public List<Rol> findAllRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Optional<Rol> findRolById(Long id) {
        Optional<Rol> rol = rolRepository.findById(id);
        return rol;
    }

    @Override
    public Rol saveRol(Rol rolNew) {
        if (rolNew != null) {
            return rolRepository.save(rolNew);
        }
        return new Rol();
    }

    @Override
    public String deleteRol(Long id) {
        if (rolRepository.findById(id).isPresent()) {
            rolRepository.deleteById(id);
            return TYPE + " eliminado correctamente.";
        }
        return "Error! El " + TYPE + " no existe";
    }

    @Override
    public String updateRol(Rol rolUpdated) {
        Long num = rolUpdated.getId();
        if (rolRepository.findById(num).isPresent()) {
            Rol rolToUpdate = new Rol();
            rolToUpdate.setId(rolUpdated.getId());
            rolToUpdate.setName(rolUpdated.getName());
            rolToUpdate.setDescription(rolUpdated.getDescription());

            rolRepository.save(rolToUpdate);
            return TYPE + " modificado";
        }
        return "Error al modificar el " + TYPE;
    }

}
