package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Dias;
import com.picture_kingdom.picture_kingdom.modelo.Horarios;
import com.picture_kingdom.picture_kingdom.repo.IDiasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiasServicio implements IDiasServicio {
    @Autowired
    private IDiasRepo repo;

    @Override
    public List<Dias> ObtenerTodos() {return repo.findAll();}

    @Override
    public Optional<Integer> obtenerDiaId(String dia) {
        Optional<Dias> diaOptional = repo.findByDia(dia);
        return diaOptional.map(Dias::getDiaid);
    }
}
