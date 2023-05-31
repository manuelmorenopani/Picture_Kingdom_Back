package com.picture_kingdom.picture_kingdom.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "asientos")
public class Asientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asientoid")
    private Integer asientoid;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "salaid", nullable = false)
    private Salas sala;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "peliculaid", nullable = false)
    private Peliculas pelicula;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "horarioid", nullable = false)
    private Horarios horario;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "diaid", nullable = false)
    private Dias dia;
    @Column(name="letra_fila")
    private String letrafila;
    @Column(name="num_asiento")
    private int numeroasiento;
    @Column(name="ocupado")
    private boolean ocupado;

}