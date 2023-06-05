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
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "pass")
    private String pass;
    @Column(name = "nombre")
    private String nombre;
    @Column(name="correo_electronico")
    private String correo;

}