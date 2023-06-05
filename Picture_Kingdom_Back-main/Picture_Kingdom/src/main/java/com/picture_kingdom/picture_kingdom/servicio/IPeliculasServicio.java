package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Peliculas;

import java.util.List;

public interface IPeliculasServicio {
    List<Peliculas> ObtenerTodos();

    Peliculas obtenerPeliculaPorId(long id);
}
