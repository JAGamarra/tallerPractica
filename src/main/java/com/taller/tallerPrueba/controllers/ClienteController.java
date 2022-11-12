package com.taller.tallerPrueba.controllers;

import com.taller.tallerPrueba.models.ClienteModel;
import com.taller.tallerPrueba.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteServices clienteServices;

    @GetMapping(value = "/{documento}")
    public ResponseEntity<ClienteModel> getClienteByCedula(@PathVariable String documento) {
        return new ResponseEntity<>(this.clienteServices.findClienteByCedula(documento), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ClienteModel> crearCliente(@RequestBody ClienteModel clienteModel) {
        return new ResponseEntity<>(this.clienteServices.saveCliente(clienteModel), HttpStatus.CREATED);
    }

}