package com.taller.tallerPrueba.models;

import javax.persistence.*;

@Entity
@Table(name = "TRANSACCIONES")
public class TransaccionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CUENTA_DESTINO", nullable = false)
    private String cuentaDestino;

    @Column(name = "VALOR_TRANSACCION", nullable = false)
    private Double valorTransaccion;

    @Column(name = "ESTADO_TRANSACCION", nullable = false)
    private String estadoTransaccion;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_CUENTA", nullable = false)
    private CuentaModel cuentaOrigen;
}
