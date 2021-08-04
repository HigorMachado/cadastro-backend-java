package com.projeto.java.controller;

import com.projeto.java.entity.Endereco;
import com.projeto.java.service.ServEndereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/endereco")
public class CtrEndereco {

    private final ServEndereco _servEndereco; 

    @Autowired
    public CtrEndereco(ServEndereco servEndereco) {
        this._servEndereco = servEndereco;
    }
     
 

    @PostMapping("/novo")
    public ResponseEntity<Endereco> cadastrarEndereco(@RequestBody Endereco endereco) {

        Endereco EnderecoRetorno = _servEndereco.salvaEndereco(endereco);
        
        return new ResponseEntity<Endereco>(EnderecoRetorno, HttpStatus.CREATED);
    }
}
