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
@Table(name = "ventas")
public class Ventas {
    @Id
    @Column(name = "ventaid")
    private Integer ventaid;
    @Column(name = "peliculaid")
    private int PeliculaID;
    @Column(name="Asientoid")
    private int AsientoID;
    @Column(name="usuario")
    private String usuario;
    @Column(name="fecha_Venta")
    private String fechaVenta;

}
