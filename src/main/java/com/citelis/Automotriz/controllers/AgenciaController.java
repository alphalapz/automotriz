/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.controllers;

import java.util.List;
import java.util.Optional;

import com.citelis.Automotriz.entities.Agencia;

public interface AgenciaController {

    public List<Agencia> getAgencias();

    public Optional<Agencia> getAgenciaById(Long id);

    public Agencia addAgencia(Agencia agencia);

    public String deleteAgencia(Long id);

    public String updateAgencia(Agencia agenciaNew);

}
