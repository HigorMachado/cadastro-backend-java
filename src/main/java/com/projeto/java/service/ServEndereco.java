package com.projeto.java.service;

import com.projeto.java.entity.Endereco;
import com.projeto.java.repository.RepEndereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServEndereco {
    private final RepEndereco _RepEndereco;

    @Autowired
    public ServEndereco(RepEndereco repEndereco) {
        this._RepEndereco = repEndereco;
    }

    public Endereco salvaEndereco(Endereco endereco) {
        return _RepEndereco.saveAndFlush(endereco);
    }

}
