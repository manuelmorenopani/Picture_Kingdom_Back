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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "salaid", nullable = true)
    private Salas salaid;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "peliculaid", nullable = false)
    private Peliculas peliculaid;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "horarioid", nullable = false)
    private Horarios horarioid;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "diaid", nullable = false)
    private Dias diaid;
    @Column(name="letra_fila")
    private String letra_fila;
    @Column(name="num_asiento")
    private int num_asiento;
    @Column(name="ocupado")
    private boolean ocupado;

}