/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.controllers;

import java.util.List;
import java.util.Optional;

import com.citelis.Automotriz.entities.Empleado;

public interface EmpleadoController {

    public List<Empleado> getEmpleados();

    public Optional<Empleado> getEmpleadoById(Long id);

    public Empleado addEmpleado(Empleado agencia);

    public String deleteEmpleado(Long id);

    public String updateEmpleado(Empleado agenciaNew);

}
