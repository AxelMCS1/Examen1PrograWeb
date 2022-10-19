/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ExamenWeb.service;

import com.ExamenWeb.entity.pelicula;
import java.util.List;

/**
 *
 * @author axelc
 */
public interface iPeliculaService {
    public List<pelicula> listPelicula();
    public pelicula getPeliculaById (long id);
    public void savePelicula(pelicula pelicula);
    public void delete(long id);
}
