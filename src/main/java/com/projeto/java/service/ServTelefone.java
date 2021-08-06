package com.projeto.java.service;

import com.projeto.java.entity.Telefone;
import com.projeto.java.repository.RepTelefone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServTelefone {
    private final RepTelefone _RepTelefone;

    @Autowired
    public ServTelefone(RepTelefone repTelefone) {
        this._RepTelefone = repTelefone;
    }

    public Telefone salvaTelefone(Telefone telefone) {
        return _RepTelefone.saveAndFlush(telefone);
    }

}
