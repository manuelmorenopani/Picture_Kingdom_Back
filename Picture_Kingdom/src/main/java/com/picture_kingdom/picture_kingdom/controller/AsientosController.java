package com.picture_kingdom.picture_kingdom.controller;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Usuarios;
import com.picture_kingdom.picture_kingdom.servicio.AsientosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/asientos")
public class AsientosController {
    @Autowired

    private AsientosServicio as;
    @GetMapping
    public List<Asientos> ObtenerTodos() {return as.ObtenerTodos();}

    @PostMapping("/agregarAsientos")
    public Asientos Agregarasientos(@RequestBody Asientos asientos) {
        return as.Agregarasientos(asientos);
    }
}