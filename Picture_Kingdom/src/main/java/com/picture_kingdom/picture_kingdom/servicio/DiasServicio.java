package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Dias;
import com.picture_kingdom.picture_kingdom.modelo.Horarios;
import com.picture_kingdom.picture_kingdom.repo.IDiasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiasServicio implements IDiasServicio {
    @Autowired
    private IDiasRepo repo;

    @Override
    public List<Dias> ObtenerTodos() {return repo.findAll();}
}
