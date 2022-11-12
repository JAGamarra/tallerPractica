package com.taller.tallerPrueba.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TIPO_CUENTA")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoCuentaModel {
    @Id
    @Column(name = "tipocuenta_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tipocuenta_nombre", nullable = false)
    private String nombre;

    @Column(name = "tipocuenta_descripcion", nullable = false)
    private String descripcion;

    @Column(name = "TASA_INTERES", nullable = false)
    private Double tasaInteres;
}