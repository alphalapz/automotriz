/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.service;

import java.util.List;
import java.util.Optional;
import com.citelis.Automotriz.entities.Venta;

public interface VentaService {

    public List<Venta> findAllVentas();

    public Optional<Venta> findVentaById(Long id);

    public Venta saveVenta(Venta VentaNew);

    public String deleteVenta(Long id);

    public String updateVenta(Venta VentaNew);
}
