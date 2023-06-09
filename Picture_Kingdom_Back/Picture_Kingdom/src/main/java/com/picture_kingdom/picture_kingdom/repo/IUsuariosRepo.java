package com.picture_kingdom.picture_kingdom.repo;

import com.picture_kingdom.picture_kingdom.modelo.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuariosRepo extends JpaRepository<Usuarios,Integer> {
}
