package com.picture_kingdom.picture_kingdom;

import com.picture_kingdom.picture_kingdom.controller.AsientosController;
import com.picture_kingdom.picture_kingdom.controller.PeliculasController;
import com.picture_kingdom.picture_kingdom.modelo.*;
import com.picture_kingdom.picture_kingdom.servicio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PictureKingdomApplication implements CommandLineRunner {
    @Autowired
    private AsientosServicio asientos;

    @Autowired
    private HorariosServicio horarios;

    @Autowired
    private PeliculasServicio peliculas;

    @Autowired
    private SalasServicio salas;

    @Autowired
    private UsuariosServicio usuarios;

    @Autowired
    private VentasServicio ventas;

    @Autowired
    private AsientosController asientosc;
    @Autowired
    private PeliculasController peliculasc;
    public static void main(String[] args) {
        SpringApplication.run(PictureKingdomApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }

}
