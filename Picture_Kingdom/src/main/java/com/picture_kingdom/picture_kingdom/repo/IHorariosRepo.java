package com.picture_kingdom.picture_kingdom.repo;

import com.picture_kingdom.picture_kingdom.modelo.Horarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IHorariosRepo extends JpaRepository<Horarios,Integer> {
    List<Horarios> findByPeliculaidAndDiaid(Integer peliculaid, Integer diaid);

}
