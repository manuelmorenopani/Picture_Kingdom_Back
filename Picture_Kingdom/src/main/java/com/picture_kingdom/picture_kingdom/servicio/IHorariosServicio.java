package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Horarios;

import java.util.List;

public interface IHorariosServicio {
    List<Horarios> ObtenerTodos();
    List<Horarios> obtenerHorariosPorPeliculaYDia(Integer peliculaid, Integer diaid);

}
