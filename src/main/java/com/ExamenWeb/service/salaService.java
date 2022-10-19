/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ExamenWeb.service;

import com.ExamenWeb.entity.sala;
import com.ExamenWeb.repository.salaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author axelc
 */
@Service
public class salaService implements iSalaService{
    
    @Autowired
    private salaRepository salaRepository;

    @Override
    public List<sala> listaSala() {
        return (List<sala>) salaRepository.findAll();
    }
    
    
}
