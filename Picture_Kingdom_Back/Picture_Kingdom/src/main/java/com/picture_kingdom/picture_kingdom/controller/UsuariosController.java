package com.picture_kingdom.picture_kingdom.controller;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Usuarios;
import com.picture_kingdom.picture_kingdom.servicio.AsientosServicio;
import com.picture_kingdom.picture_kingdom.servicio.UsuariosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired

    private UsuariosServicio as;
    @GetMapping
    public List<Usuarios> ObtenerTodos() {return as.ObtenerTodos();}

    @PostMapping("/agregarUsuario")
    public Usuarios agregarUsuario(@RequestBody Usuarios usuario) {
        return as.AgregarUsuario(usuario);
    }


}
