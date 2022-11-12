package com.taller.tallerPrueba.dao;

import com.taller.tallerPrueba.models.CuentaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICuentaDAO extends JpaRepository<CuentaModel, Integer> {

    @Query(value = "SELECT * FROM CUENTAS", nativeQuery = true)
    public List<CuentaModel> getCuenta();
}
