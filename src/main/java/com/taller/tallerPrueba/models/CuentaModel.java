package com.taller.tallerPrueba.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CUENTAS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuentaModel {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NUMERO_CUENTA", nullable = false, length = 20)
    private String numeroCuenta;

    @Column(name = "SALDO_DISPONIBLE", nullable = false)
    private Double saldoDisponible;

    @JsonBackReference
    @JoinColumn(name = "CLIENTE_FK", nullable = false, referencedColumnName = "ID")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private ClienteModel cliente;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "TIPO_CUENTA_FK")
    private TipoCuentaModel tipoCuenta;

    @Column(name = "ESTADO_CUENTA")
    private Boolean isActive;

    @OneToMany(mappedBy = "cuentaOrigen")
    private List<TransaccionModel> transacciones;
}