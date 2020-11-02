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
import com.citelis.Automotriz.entities.Empleado;
import com.citelis.Automotriz.repository.EmpleadoRepository;
import com.citelis.Automotriz.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private static final String TYPE = "Empleado";

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Optional<Empleado> findEmpleadoById(Long id) {
        Optional<Empleado> empleado = empleadoRepository.findById(id);
        return empleado;
    }

    @Override
    public Empleado saveEmpleado(Empleado EmpleadoNew) {
        if (EmpleadoNew != null) {
            return empleadoRepository.save(EmpleadoNew);
        }
        return new Empleado();
    }

    @Override
    public String deleteEmpleado(Long id) {
        if (empleadoRepository.findById(id).isPresent()) {
            empleadoRepository.deleteById(id);
            return TYPE + " eliminado correctamente.";
        }
        return "Error! El " + TYPE + " no existe";
    }

    @Override
    public String updateEmpleado(Empleado empleadoUpdated) {
        Long num = empleadoUpdated.getId();
        if (empleadoRepository.findById(num).isPresent()) {
            Empleado empleadoToUpdate = new Empleado();
            empleadoToUpdate.setId(empleadoUpdated.getId());
            empleadoToUpdate.setName(empleadoUpdated.getName());
            empleadoToUpdate.setMail(empleadoUpdated.getMail());
            empleadoToUpdate.setJob(empleadoUpdated.getJob());
            empleadoToUpdate.setFkAgenci(empleadoUpdated.getFkAgenci());
            empleadoToUpdate.setFkRol(empleadoUpdated.getFkRol());

            empleadoRepository.save(empleadoToUpdate);
            return TYPE + " modificado";
        }
        return "Error al modificar el " + TYPE;
    }
}
