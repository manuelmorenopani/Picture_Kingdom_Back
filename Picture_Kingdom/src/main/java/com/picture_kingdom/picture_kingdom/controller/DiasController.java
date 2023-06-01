package com.picture_kingdom.picture_kingdom.controller;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Dias;
import com.picture_kingdom.picture_kingdom.servicio.AsientosServicio;
import com.picture_kingdom.picture_kingdom.servicio.DiasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/dias")
public class DiasController {
    @Autowired

    private DiasServicio as;
    @GetMapping
    public List<Dias> ObtenerTodos() {return as.ObtenerTodos();}

    @GetMapping("/obtenerDiaId")
    public ResponseEntity<Integer> obtenerDiaId(@RequestParam String dia) {
        try {
            Optional<Integer> diaIdOptional = as.obtenerDiaId(dia);
            if (diaIdOptional.isPresent()) {
                int diaId = diaIdOptional.get();
                return ResponseEntity.ok(diaId);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}