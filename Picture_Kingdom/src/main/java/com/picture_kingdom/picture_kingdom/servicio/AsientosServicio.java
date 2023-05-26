package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.repo.IAsientosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsientosServicio implements IAsientosServicio {
    @Autowired
    private IAsientosRepo repo;

    @Override
    public List<Asientos> ObtenerTodos() {return repo.findAll();}
}

