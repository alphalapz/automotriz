/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.citelis.Automotriz.entities.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {

	Void save(Optional<Venta> ventaToUpdate);

}