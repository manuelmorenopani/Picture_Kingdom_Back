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
@Table(name = "asientos")
public class Asientos {
    @Id
    @Column(name = "asientoid")
    private int asientoid;
    @Column(name = "salaid")
    private int salaid;
    @Column(name="letra_fila")
    private int letrafila;
    @Column(name="num_asiento")
    private int numeroasiento;
    @Column(name="estado")
    private boolean estado;
    @Column(name="seleccionado")
    private boolean seleccionado;

}