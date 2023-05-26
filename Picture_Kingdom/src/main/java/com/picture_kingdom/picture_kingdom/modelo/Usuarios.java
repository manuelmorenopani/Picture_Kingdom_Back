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
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @Column(name = "Usuario")
    private String Usuario;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name="Correo_electronico")
    private String Correo;
    @Column(name="Telefono")
    private int Telefono;
    @Column(name="Direccion")
    private String Direccion;

}