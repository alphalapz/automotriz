/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.service;

import java.util.List;
import java.util.Optional;
import com.citelis.Automotriz.entities.Empleado;

public interface EmpleadoService {

    public List<Empleado> findAllEmpleados();

    public Optional<Empleado> findEmpleadoById(Long id);

    public Empleado saveEmpleado(Empleado empleadoNew);

    public String deleteEmpleado(Long id);

    public String updateEmpleado(Empleado empleadoNew);
}
