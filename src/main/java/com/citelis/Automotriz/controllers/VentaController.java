/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.controllers;

import java.util.List;
import java.util.Optional;

import com.citelis.Automotriz.entities.Venta;

public interface VentaController {

    public List<Venta> getVentas();

    public Optional<Venta> getVentaById(Long id);

    public Venta addVenta(Venta Venta);

    public String deleteVenta(Long id);

    public String updateVenta(Venta VentaNew);

}
