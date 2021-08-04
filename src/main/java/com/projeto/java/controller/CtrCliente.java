package com.projeto.java.controller;

import com.projeto.java.entity.Cliente;
import com.projeto.java.service.ServCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cliente")
public class CtrCliente {

    private final ServCliente _servCliente;

    @Autowired
    public CtrCliente(ServCliente servCliente) {
        this._servCliente = servCliente;
    }

    @PostMapping("/novo")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente) {

        Cliente clienteRetorno = _servCliente.salvaCliente(cliente);
        
        return new ResponseEntity<Cliente>(clienteRetorno, HttpStatus.CREATED);
    }
}
