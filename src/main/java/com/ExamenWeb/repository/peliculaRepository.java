/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ExamenWeb.repository;

import com.ExamenWeb.entity.pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author axelc
 */
@Repository
public interface peliculaRepository extends CrudRepository<pelicula,Long>{
    
}
