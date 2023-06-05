package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Salas;
import com.picture_kingdom.picture_kingdom.repo.IAsientosRepo;
import com.picture_kingdom.picture_kingdom.repo.ISalasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalasServicio implements ISalasServicio {
    @Autowired
    private ISalasRepo repo;

    @Override
    public List<Salas> ObtenerTodos() {return repo.findAll();}
}


