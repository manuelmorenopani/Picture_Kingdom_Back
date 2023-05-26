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
    @Column(name = "VentaID")
    private int VentaID;
    @Column(name = "PeliculaID")
    private int PeliculaID;
    @Column(name="AsientoID")
    private int AsientoID;
    @Column(name="Usuario")
    private String Usuario;
    @Column(name="Fecha_Venta")
    private String FechaVenta;

}
