/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.controllers;

import java.util.List;
import java.util.Optional;

import com.citelis.Automotriz.entities.Rol;

public interface RolController {

    public List<Rol> getRoles();

    public Optional<Rol> getRolById(Long id);

    public Rol addRol(Rol agencia);

    public String deleteRol(Long id);

    public String updateRol(Rol agenciaNew);

}
