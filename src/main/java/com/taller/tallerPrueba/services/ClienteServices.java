package com.taller.tallerPrueba.services;

import com.taller.tallerPrueba.dao.IClienteDAO;
import com.taller.tallerPrueba.models.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServices {

    @Autowired
    private IClienteDAO clienteDAO;

    public ClienteModel findClienteByCedula(String documento) {
        return this.clienteDAO.getClienteByCedula(documento);
    }

    public ClienteModel saveCliente(ClienteModel clienteModel) {
        return this.clienteDAO.save(clienteModel);
    }
}
