package com.picture_kingdom.picture_kingdom.modelo;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salaid")
    private Integer salaid;
    @Column(name = "nombre")
    private String nombre;
    @Column(name="tipo")
    private String tipo;


}
