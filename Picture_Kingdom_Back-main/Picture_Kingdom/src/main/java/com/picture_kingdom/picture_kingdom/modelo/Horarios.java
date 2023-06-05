package com.picture_kingdom.picture_kingdom.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "horarios")
public class Horarios {
    @Id
    @Column(name = "horarioid")
    private Integer horarioid;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "peliculaid", nullable = false)
    private Peliculas pelicula;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "salaid", nullable = false)
    private Salas sala;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "diaid", nullable = false)
    private Dias dia;

    @Column(name="hora_inicio")
    private String hora_inicio;

}
