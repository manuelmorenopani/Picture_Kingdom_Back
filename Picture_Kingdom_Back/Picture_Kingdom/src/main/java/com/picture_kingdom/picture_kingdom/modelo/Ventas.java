package com.picture_kingdom.picture_kingdom.modelo;

import jakarta.persistence.*;
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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "peliculaid", nullable = false)
    private Peliculas peliculaid;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "asientod", nullable = false)
    private Dias asientoid;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "salaid", nullable = true)
    private Salas salaid;
    @JoinColumn(name = "usuario", nullable = true)
    private String usuario;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "horarioid", nullable = false)
    private Horarios horarioid;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "diaid", nullable = false)
    private Dias diaid;

    @Column(name="fecha_Venta")
    private String fechaVenta;
    @Column(name="tipo_entrada")
    private String tipo_entrada;
    @Column(name="precio")
    private double precio;
}
