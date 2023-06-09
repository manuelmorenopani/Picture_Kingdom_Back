package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Horarios;
import com.picture_kingdom.picture_kingdom.modelo.Usuarios;
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

    @Override
    public Asientos Agregarasientos(Asientos asientos) {
        System.out.println(asientos);return repo.saveAndFlush(asientos);
    }

    @Override
    public List<Asientos> findAsientos(Integer peliculaid, Integer diaid, Integer horarioid) {
        return repo.findAsientos(peliculaid,diaid,horarioid);
    }

}

