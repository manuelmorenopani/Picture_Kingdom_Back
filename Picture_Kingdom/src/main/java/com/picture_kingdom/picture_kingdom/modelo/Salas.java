package com.picture_kingdom.picture_kingdom.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "salas")
public class Salas {
    @Id
    @Column(name = "SalasID")
    private int id;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name="Capacidad_Max")
    private int CapacidadMax;
    @Column(name="Tipo")
    private String Tipo;


}
