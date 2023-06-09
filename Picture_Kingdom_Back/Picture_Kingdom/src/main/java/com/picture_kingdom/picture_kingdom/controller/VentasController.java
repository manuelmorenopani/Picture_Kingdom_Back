package com.picture_kingdom.picture_kingdom.controller;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Ventas;
import com.picture_kingdom.picture_kingdom.servicio.AsientosServicio;
import com.picture_kingdom.picture_kingdom.servicio.VentasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ventas")
public class VentasController {
    @Autowired

    private VentasServicio as;

    @GetMapping
    public List<Ventas> ObtenerTodos() {
        return as.ObtenerTodos();
    }

    @PostMapping("/agregarVentas")
    public Ventas AgregarVentas(@RequestBody Ventas ventas) {
        return as.AgregarVentas(ventas);
    }

}