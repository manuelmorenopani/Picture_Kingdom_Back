package com.picture_kingdom.picture_kingdom.controller;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Dias;
import com.picture_kingdom.picture_kingdom.servicio.AsientosServicio;
import com.picture_kingdom.picture_kingdom.servicio.DiasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/dias")
public class DiasController {
    @Autowired

    private DiasServicio as;
    @GetMapping
    public List<Dias> ObtenerTodos() {return as.ObtenerTodos();}


}