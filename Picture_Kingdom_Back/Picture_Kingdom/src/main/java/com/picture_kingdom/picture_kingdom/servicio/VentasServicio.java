package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Ventas;
import com.picture_kingdom.picture_kingdom.repo.IAsientosRepo;
import com.picture_kingdom.picture_kingdom.repo.IVentasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentasServicio implements IVentasServicio {
    @Autowired
    private IVentasRepo repo;

    @Override
    public List<Ventas> ObtenerTodos() {return repo.findAll();}

    @Override
    public Ventas AgregarVentas(Ventas ventas) {
        System.out.println(ventas);return repo.saveAndFlush(ventas);
    }
}


