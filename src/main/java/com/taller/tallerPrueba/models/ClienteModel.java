package com.taller.tallerPrueba.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteModel {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOMBRE_COMPLETO", nullable = false)
    private String nombreCompleto;

    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(name = "NUMERO_DOCUMENTO", nullable = false, length =  20)
    private String nroDocumento;

    @Column(name = "E_MAIL", nullable = false)
    private String email;

    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;

    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference
    private List<CuentaModel> cuenta;
}