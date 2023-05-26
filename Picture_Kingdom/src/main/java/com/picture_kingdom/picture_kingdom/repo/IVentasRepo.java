package com.picture_kingdom.picture_kingdom.repo;

import com.picture_kingdom.picture_kingdom.modelo.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentasRepo extends JpaRepository<Ventas,Integer> {
}
