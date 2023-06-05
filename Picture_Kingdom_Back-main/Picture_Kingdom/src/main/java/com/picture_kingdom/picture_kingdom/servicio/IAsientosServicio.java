package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Usuarios;

import java.util.List;

public interface IAsientosServicio {
    List<Asientos> ObtenerTodos();

    Asientos Agregarasientos(Asientos asientos);
}
