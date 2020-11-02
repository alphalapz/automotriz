/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.service;

import java.util.List;
import java.util.Optional;
import com.citelis.Automotriz.entities.Agencia;

public interface AgenciaService {

    public List<Agencia> findAllAgencias();

    public Optional<Agencia> findAgenciaById(Long id);

    public Agencia saveAgencia(Agencia agenciaNew);

    public String deleteAgencia(Long id);

    public String updateAgencia(Agencia agenciaNew);
}
