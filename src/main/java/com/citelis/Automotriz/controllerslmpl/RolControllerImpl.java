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

import com.citelis.Automotriz.controllers.RolController;
import com.citelis.Automotriz.entities.Rol;
import com.citelis.Automotriz.service.RolService;

@RestController
public class RolControllerImpl implements RolController {

    @Autowired
    RolService rolService;

    // http://localhost:8080/roles (GET)
    @RequestMapping(value = "/roles", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Rol> getRoles() {
        return rolService.findAllRoles();
    }

    // http://localhost:8080/roles/1 (GET)
    @Override
    @RequestMapping(value = "/rol/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Rol> getRolById(@PathVariable Long id) {
        return rolService.findRolById(id);
    }

    // http://localhost:8080/roles/add (ADD)
    @Override
    @RequestMapping(value = "/roles/add", method = RequestMethod.POST, produces = "application/json")
    public Rol addRol(Rol rol) {
        return rolService.saveRol(rol);
    }

    // http://localhost:8080/roles/delete/1 (GET)
    @Override
    @RequestMapping(value = "/roles/delete/{id}", method = RequestMethod.GET, produces = "application/json")
    public String deleteRol(@PathVariable Long id) {
        return rolService.deleteRol(id);
    }

    // http://localhost:8080/roles/update (PATCH)
    @Override
    @RequestMapping(value = "/roles/update", method = RequestMethod.PATCH, produces = "application/json")
    public String updateRol(Rol rolNew) {
        return rolService.updateRol(rolNew);
    }

}
