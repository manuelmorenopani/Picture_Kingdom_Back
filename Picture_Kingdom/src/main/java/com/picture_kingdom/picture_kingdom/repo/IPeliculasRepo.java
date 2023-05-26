package com.picture_kingdom.picture_kingdom.repo;

import com.picture_kingdom.picture_kingdom.modelo.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculasRepo extends JpaRepository<Peliculas,Integer> {

}
