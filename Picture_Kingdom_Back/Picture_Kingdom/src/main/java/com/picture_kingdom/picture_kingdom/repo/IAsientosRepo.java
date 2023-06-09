package com.picture_kingdom.picture_kingdom.repo;

import com.picture_kingdom.picture_kingdom.modelo.Asientos;
import com.picture_kingdom.picture_kingdom.modelo.Horarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IAsientosRepo extends JpaRepository<Asientos,Integer> {
    @Query(value = "SELECT * FROM asientos WHERE peliculaid =:peliculaid AND diaid =:diaid AND horarioid =:horarioid", nativeQuery = true)
    List<Asientos> findAsientos(@Param("peliculaid") Integer peliculaid, @Param("diaid") Integer diaid, @Param("horarioid") Integer horarioid);
}
