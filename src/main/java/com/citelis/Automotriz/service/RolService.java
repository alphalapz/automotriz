/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.service;

import java.util.List;
import java.util.Optional;
import com.citelis.Automotriz.entities.Rol;

public interface RolService {

    public List<Rol> findAllRoles();

    public Optional<Rol> findRolById(Long id);

    public Rol saveRol(Rol rolNew);

    public String deleteRol(Long id);

    public String updateRol(Rol rolNew);
}
