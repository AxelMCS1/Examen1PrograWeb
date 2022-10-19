/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ExamenWeb.repository;

import com.ExamenWeb.entity.pelicula;
import com.ExamenWeb.entity.sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author axelc
 */
@Repository
public interface salaRepository extends CrudRepository<sala,Long>{
    
}
