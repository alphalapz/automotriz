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

import com.citelis.Automotriz.controllers.VentaController;
import com.citelis.Automotriz.entities.Venta;
import com.citelis.Automotriz.service.VentaService;

@RestController
public class VentaControllerImpl implements VentaController {

    @Autowired
    VentaService VentaService;

    // http://localhost:8080/Ventas (GET)
    @RequestMapping(value = "/Ventas", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Venta> getVentas() {
        return VentaService.findAllVentas();
    }

    // http://localhost:8080/Ventas/1 (GET)
    @Override
    @RequestMapping(value = "/Venta/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Venta> getVentaById(@PathVariable Long id) {
        return VentaService.findVentaById(id);
    }

    // http://localhost:8080/Ventas/add (ADD)
    @Override
    @RequestMapping(value = "/Ventas/add", method = RequestMethod.POST, produces = "application/json")
    public Venta addVenta(Venta Venta) {
        return VentaService.saveVenta(Venta);
    }

    // http://localhost:8080/Ventas/delete/1 (GET)
    @Override
    @RequestMapping(value = "/Ventas/delete/{id}", method = RequestMethod.GET, produces = "application/json")
    public String deleteVenta(@PathVariable Long id) {
        return VentaService.deleteVenta(id);
    }

    // http://localhost:8080/Ventas/update (PATCH)
    @Override
    @RequestMapping(value = "/Ventas/update", method = RequestMethod.PATCH, produces = "application/json")
    public String updateVenta(Venta VentaNew) {
        return VentaService.updateVenta(VentaNew);
    }

}
