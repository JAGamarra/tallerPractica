package com.taller.tallerPrueba.controllers;

import com.taller.tallerPrueba.models.CuentaModel;
import com.taller.tallerPrueba.services.CuentaService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @GetMapping
    public ResponseEntity<List<CuentaModel>> createCuenta() {
        return new ResponseEntity<>(this.cuentaService.getCuentas(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createCuenta(@RequestBody CuentaModel cuenta) {
        return new ResponseEntity<>(this.cuentaService.createCuenta(cuenta), HttpStatus.CREATED);
    }
}
