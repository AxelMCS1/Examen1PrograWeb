/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ExamenWeb.controller;

import com.ExamenWeb.entity.pelicula;
import com.ExamenWeb.entity.sala;
import com.ExamenWeb.service.iPeliculaService;
import com.ExamenWeb.service.iSalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author axelc
 */
@Controller
public class peliculaController {

    @Autowired
    private iPeliculaService peliculaService;

    @Autowired
    private iSalaService salaService;

    @GetMapping("/pelicula")
    public String pelicula(Model model) {
        List<pelicula> listaPeliculas = peliculaService.listPelicula();
        model.addAttribute("titulo", "Cinelitas");
        model.addAttribute("subtitulo", "Tu cine favorito");
        model.addAttribute("pelicula", listaPeliculas);
        return "pelicula";
    }

    @GetMapping("/crearPelicula")
    public String crearPelicula(Model model) {
        List<sala> listaSala = salaService.listaSala();
        model.addAttribute("pelicula", new pelicula());
        model.addAttribute("sala", listaSala);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }

    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula) {
        peliculaService.delete(idPelicula);
        return "redirect:/pelicula";
    }
}
