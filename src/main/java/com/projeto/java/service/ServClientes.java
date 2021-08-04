package com.projeto.java.service;

import com.projeto.java.entity.Clientes;
import com.projeto.java.repository.RepClientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServClientes {
    private final RepClientes _RepClientes;

    @Autowired
    public ServClientes(RepClientes repClientes) {
        this._RepClientes = repClientes;
    }

    public Clientes salvaClientes(Clientes clientes) {
        return _RepClientes.saveAndFlush(clientes);
    }

}
