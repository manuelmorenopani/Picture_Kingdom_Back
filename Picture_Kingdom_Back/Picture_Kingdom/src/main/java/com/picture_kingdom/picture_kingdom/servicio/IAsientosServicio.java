package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Horarios;
import com.picture_kingdom.picture_kingdom.modelo.Usuarios;

import java.util.List;

public interface IAsientosServicio {
    List<Asientos> ObtenerTodos();

    Asientos Agregarasientos(Asientos asientos);

    List<Asientos> findAsientos(Integer peliculaid, Integer diaid,Integer horarioid);
}
