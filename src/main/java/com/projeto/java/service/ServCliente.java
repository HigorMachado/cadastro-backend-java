package com.projeto.java.service;

import com.projeto.java.entity.Cliente;
import com.projeto.java.repository.RepCliente;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServCliente {
    private final RepCliente _RepCliente;

    @Autowired
    public ServCliente(RepCliente repCliente) {
        this._RepCliente = repCliente;
    }

    public Cliente salvaCliente(Cliente cliente) {
        return _RepCliente.saveAndFlush(cliente);

    }

}
