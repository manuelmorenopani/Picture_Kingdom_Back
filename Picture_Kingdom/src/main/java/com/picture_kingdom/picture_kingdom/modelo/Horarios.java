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
@Table(name = "horarios")
public class Horarios {
    @Id
    @Column(name = "horarioid")
    private Integer horarioid;
    @Column(name = "peliculaid")
    private int peliculaid;
    @Column(name="salaid")
    private int salaid;
    @Column(name="Fecha_y_hora_inicio")
    private String FechahoraInicio;
    @Column(name="diaid")
    private int diaid;

}
