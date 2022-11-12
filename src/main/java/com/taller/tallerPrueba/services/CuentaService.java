package com.taller.tallerPrueba.services;

import com.taller.tallerPrueba.dao.ICuentaDAO;
import com.taller.tallerPrueba.models.CuentaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaService {

    @Autowired
    private ICuentaDAO cuentaDAO;

    public CuentaModel createCuenta(CuentaModel cuenta) {
        return this.cuentaDAO.save(cuenta);
    }

    public List<CuentaModel> getCuentas() {
        return this.cuentaDAO.getCuenta();
    }
}
