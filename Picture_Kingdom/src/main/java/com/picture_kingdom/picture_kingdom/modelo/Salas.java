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
    @Column(name = "salaid")
    private Integer salaid;
    @Column(name = "nombre")
    private String nombre;
    @Column(name="tipo")
    private String tipo;


}
