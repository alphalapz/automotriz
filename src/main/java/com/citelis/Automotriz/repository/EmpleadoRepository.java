/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.citelis.Automotriz.entities.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

	Void save(Optional<Empleado> EmpleadoToUpdate);

}