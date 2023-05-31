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
    private Integer asientoid;
    @Column(name = "salaid")
    private int salaid;
    @Column(name = "peliculaid")
    private int peliculaid;
    @Column(name = "horarioid")
    private int horarioid;
    @Column(name="letra_fila")
    private String letrafila;
    @Column(name="num_asiento")
    private int numeroasiento;
    @Column(name="ocupado")
    private boolean ocupado;

}