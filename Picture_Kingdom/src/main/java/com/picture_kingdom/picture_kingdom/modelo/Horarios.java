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
    @Column(name = "HorarioID")
    private int id;
    @Column(name = "PeliculaID")
    private int PeliculaID;
    @Column(name="SalaID")
    private int SalaID;
    @Column(name="Fecha_y_hora_inicio")
    private String FechahoraInicio;
    @Column(name="Fecha_y_hora_fin")
    private String FechahoraFin;

}
