package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Dias;

import java.util.List;
import java.util.Optional;

public interface IDiasServicio {
    List<Dias> ObtenerTodos();
    Optional<Integer> obtenerDiaId(String dia);
}

