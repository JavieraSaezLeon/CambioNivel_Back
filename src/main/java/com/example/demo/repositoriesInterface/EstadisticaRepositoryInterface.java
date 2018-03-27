/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repositoriesInterface;

import com.example.demo.domain.Estadistica;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author javiera
 */
public interface EstadisticaRepositoryInterface extends JpaRepository<Estadistica, Long>{


    
}
