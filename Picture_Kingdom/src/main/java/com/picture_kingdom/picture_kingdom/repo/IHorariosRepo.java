package com.picture_kingdom.picture_kingdom.repo;

import com.picture_kingdom.picture_kingdom.modelo.Horarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IHorariosRepo extends JpaRepository<Horarios, Integer> {
    @Query(value = "SELECT * FROM horarios WHERE peliculaid = :peliculaid AND diaid = :diaid", nativeQuery = true)
    List<Horarios> findByPeliculaidAndDiaid(@Param("peliculaid") Integer peliculaid, @Param("diaid") Integer diaid);
}