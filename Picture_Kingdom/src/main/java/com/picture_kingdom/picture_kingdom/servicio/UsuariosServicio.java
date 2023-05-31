package com.picture_kingdom.picture_kingdom.servicio;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Usuarios;
import com.picture_kingdom.picture_kingdom.repo.IAsientosRepo;
import com.picture_kingdom.picture_kingdom.repo.IUsuariosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuariosServicio implements IUsuariosServicio{
    @Autowired
    private IUsuariosRepo repo;

    @Override
    public List<Usuarios> ObtenerTodos() {return repo.findAll();}

    @Override
    public Usuarios AgregarUsuario(Usuarios usuario) {
        return repo.save(usuario);
    }

}


