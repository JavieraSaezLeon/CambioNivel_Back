/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controllers;

import com.example.demo.domain.Estadistica;
import com.example.demo.domain.Query;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.servicesInterfaces.EstadisticaServiceInterface;

/**
 *
 * @author javiera
 */
@RestController
public class EstadisticaController {
    
    @Autowired
    EstadisticaServiceInterface numberServiceInterface;
    
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(value = "/")
    public List<Estadistica> getAll() {
        List<Estadistica> number = numberServiceInterface.getAll();
        return number;
    }
    
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "/numbers")
    public List<Estadistica> getAllNumber(@RequestBody Query query) {
        List<Estadistica> lista_number = numberServiceInterface.ingresarNumero(query);
        return lista_number;
    }
    
}
