package com.projeto.java.controller;

import com.projeto.java.entity.Clientes;
import com.projeto.java.service.ServClientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/clientes")
public class CtrClientes {

    private final ServClientes _servClientes;

    @Autowired
    public CtrClientes(ServClientes servClientes) {
        this._servClientes = servClientes;
    }

    @PostMapping("/novo")
    public ResponseEntity<Clientes> cadastrarClientes(@RequestBody Clientes clientes) {

        Clientes clientesRetorno = _servClientes.salvaClientes(clientes);
        
        return new ResponseEntity<Clientes>(clientesRetorno, HttpStatus.CREATED);
    }
}
