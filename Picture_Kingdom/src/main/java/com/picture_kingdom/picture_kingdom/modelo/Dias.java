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
@Table(name = "dias")
public class Dias {
    @Id
    @Column(name = "diaid")
    private Integer diaid;
    @Column(name = "dia")
    private String dia;

}
