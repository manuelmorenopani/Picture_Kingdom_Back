package com.picture_kingdom.picture_kingdom.controller;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Peliculas;
import com.picture_kingdom.picture_kingdom.servicio.AsientosServicio;
import com.picture_kingdom.picture_kingdom.servicio.PeliculasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/peliculas")
public class PeliculasController {
    @Autowired

    private PeliculasServicio ps;

    @GetMapping
    public List<Peliculas> ObtenerTodos() {
        return ps.ObtenerTodos();
    }
    @GetMapping("/{id}")
    public Peliculas obtenerPeliculaPorId(@PathVariable long id) {
        return ps.obtenerPeliculaPorId(id);
    }
    }



