package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Ventas;

import java.util.List;

public interface IVentasServicio {
    List<Ventas> ObtenerTodos();

    Ventas AgregarVentas(Ventas ventas);

}
