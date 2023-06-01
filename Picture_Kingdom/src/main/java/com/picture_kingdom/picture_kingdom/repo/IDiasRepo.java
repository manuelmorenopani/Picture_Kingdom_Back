package com.picture_kingdom.picture_kingdom.repo;

import com.picture_kingdom.picture_kingdom.modelo.Dias;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IDiasRepo extends JpaRepository<Dias,Integer> {
    Optional<Dias> findByDia(String dia);
}
