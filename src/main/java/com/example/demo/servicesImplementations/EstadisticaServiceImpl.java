/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicesImplementations;


import com.example.demo.domain.Estadistica;
import com.example.demo.domain.Query;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositoriesInterface.EstadisticaRepositoryInterface;
import com.example.demo.servicesInterfaces.EstadisticaServiceInterface;

/**
 *
 * @author javiera
 */
@Service
public class EstadisticaServiceImpl implements EstadisticaServiceInterface{
    
    @Autowired
    EstadisticaRepositoryInterface numberRI;
    
    
    @Override
    public List<Estadistica> getAll() {
        List<Estadistica> number = numberRI.findAll();
        return number;
    }
    
    @Override
    public List<Estadistica> ingresarNumero(Query query){
        Estadistica number =  new Estadistica();
        number.setValor(query.getPorcentaje());
        numberRI.save(number);
        List<Estadistica> lista_number = numberRI.findAll();
        return lista_number;
    }
}
