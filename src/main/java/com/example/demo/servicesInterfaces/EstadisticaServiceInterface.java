/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicesInterfaces;

import com.example.demo.domain.Estadistica;
import com.example.demo.domain.Query;
import java.util.List;

/**
 *
 * @author javiera
 */
public interface EstadisticaServiceInterface {
    
    public List<Estadistica> getAll();
    
    public List<Estadistica> ingresarNumero(Query query); 
    
}
