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

import com.citelis.Automotriz.controllers.AgenciaController;
import com.citelis.Automotriz.entities.Agencia;
import com.citelis.Automotriz.service.AgenciaService;

@RestController
public class AgenciaControllerImpl implements AgenciaController {

    @Autowired
    AgenciaService agenciaService;

    // http://localhost:8080/agencias (GET)
    @RequestMapping(value = "/agencias", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Agencia> getAgencias() {
        return agenciaService.findAllAgencias();
    }

    // http://localhost:8080/agencias/1 (GET)
    @Override
    @RequestMapping(value = "/agencia/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Agencia> getAgenciaById(@PathVariable Long id) {
        return agenciaService.findAgenciaById(id);
    }

    // http://localhost:8080/agencias/add (ADD)
    @Override
    @RequestMapping(value = "/agencias/add", method = RequestMethod.POST, produces = "application/json")
    public Agencia addAgencia(Agencia agencia) {
        return agenciaService.saveAgencia(agencia);
    }

    // http://localhost:8080/agencias/delete/1 (GET)
    @Override
    @RequestMapping(value = "/agencias/delete/{id}", method = RequestMethod.GET, produces = "application/json")
    public String deleteAgencia(@PathVariable Long id) {
        return agenciaService.deleteAgencia(id);
    }

    // http://localhost:8080/agencias/update (PATCH)
    @Override
    @RequestMapping(value = "/agencias/update", method = RequestMethod.PATCH, produces = "application/json")
    public String updateAgencia(Agencia agenciaNew) {
        return agenciaService.updateAgencia(agenciaNew);
    }
}
