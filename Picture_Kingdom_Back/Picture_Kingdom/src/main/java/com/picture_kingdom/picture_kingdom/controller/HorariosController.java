package com.picture_kingdom.picture_kingdom.controller;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Horarios;
import com.picture_kingdom.picture_kingdom.servicio.AsientosServicio;
import com.picture_kingdom.picture_kingdom.servicio.HorariosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/horarios")
public class HorariosController {
    @Autowired

    private HorariosServicio as;
    @GetMapping
    public List<Horarios> ObtenerTodos() {return as.ObtenerTodos();}

    @GetMapping("/pelicula/{peliculaid}/dia/{diaid}")
    public List<Horarios> obtenerHorariosPorPeliculaYDia(@PathVariable Integer peliculaid, @PathVariable Integer diaid) {
        return as.obtenerHorariosPorPeliculaYDia(peliculaid, diaid);
    }


}
