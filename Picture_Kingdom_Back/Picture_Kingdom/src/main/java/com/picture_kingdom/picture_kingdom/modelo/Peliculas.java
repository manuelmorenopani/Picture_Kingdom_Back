package com.picture_kingdom.picture_kingdom.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "peliculas")
public class Peliculas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name="sinopsis")
    private String sinopsis;
    @Column(name="director")
    private String director;
    @Column(name="reparto")
    private String reparto;
    @Column(name="duracion")
    private String duracion;
    @Column(name="genero")
    private String genero;
    @Column(name="imagen")
    private String imagen;
}
