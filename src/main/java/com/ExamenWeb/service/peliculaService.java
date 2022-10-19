/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ExamenWeb.service;

import com.ExamenWeb.entity.pelicula;
import com.ExamenWeb.repository.peliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author axelc
 */
@Service
public class peliculaService implements iPeliculaService {

    @Autowired
    private peliculaRepository peliculaRepository;

    @Override
    public List<pelicula> listPelicula() {
        return (List<pelicula>) peliculaRepository.findAll();
    }

    @Override
    public pelicula getPeliculaById(long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePelicula(pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public void delete(long id) {
        peliculaRepository.deleteById(id);
    }

}
