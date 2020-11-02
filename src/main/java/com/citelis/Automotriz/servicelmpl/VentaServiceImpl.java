/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.servicelmpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.citelis.Automotriz.entities.Venta;
import com.citelis.Automotriz.repository.VentaRepository;
import com.citelis.Automotriz.service.VentaService;

@Service
public class VentaServiceImpl implements VentaService {

    private static final String TYPE = "Venta";

    @Autowired
    VentaRepository VentaRepository;

    @Override
    public List<Venta> findAllVentas() {
        return VentaRepository.findAll();
    }

    @Override
    public Optional<Venta> findVentaById(Long id) {
        Optional<Venta> Venta = VentaRepository.findById(id);
        return Venta;
    }

    @Override
    public Venta saveVenta(Venta ventaNew) {
        if (ventaNew != null) {
            return VentaRepository.save(ventaNew);
        }
        return new Venta();
    }

    @Override
    public String deleteVenta(Long id) {
        if (VentaRepository.findById(id).isPresent()) {
            VentaRepository.deleteById(id);
            return "Venta eliminado correctamente.";
        }
        return "Error! El " + TYPE + " no existe";
    }

    @Override
    public String updateVenta(Venta VentaUpdated) {
        Long num = VentaUpdated.getId();
        if (VentaRepository.findById(num).isPresent()) {
            Venta VentaToUpdate = new Venta();
            VentaToUpdate.setId(VentaUpdated.getId());
            VentaToUpdate.setProcess(VentaUpdated.getProcess());
            VentaToUpdate.setMailText(VentaUpdated.getMailText());

            VentaRepository.save(VentaToUpdate);
            return TYPE + " modificado";
        }
        return "Error al modificar el " + TYPE;
    }
}
