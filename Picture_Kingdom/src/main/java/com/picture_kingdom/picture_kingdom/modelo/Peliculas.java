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
@Table(name = "peliculas")
public class Peliculas {
    @Id
    @Column(name = "id")
    private int id;
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
    @Column(name="anio")
    private String anio;
    @Column(name="imagen")
    private String imagen;


}
