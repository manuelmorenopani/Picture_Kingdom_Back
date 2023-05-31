package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Peliculas;
import com.picture_kingdom.picture_kingdom.repo.IAsientosRepo;
import com.picture_kingdom.picture_kingdom.repo.IPeliculasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeliculasServicio implements IPeliculasServicio {
    @Autowired
    private IPeliculasRepo repo;

    @Override
    public List<Peliculas> ObtenerTodos() {return repo.findAll();
    }

    @Override
    public Peliculas obtenerPeliculaPorId(long id) {
        return repo.findById(id);
    }
}


