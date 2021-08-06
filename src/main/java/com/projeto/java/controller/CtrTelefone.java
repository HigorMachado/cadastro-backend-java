package com.projeto.java.controller;

import com.projeto.java.entity.Telefone;
import com.projeto.java.service.ServTelefone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/telefone")
public class CtrTelefone {

    private final ServTelefone _servTelefone; 

    @Autowired
    public CtrTelefone(ServTelefone servTelefone) {
        this._servTelefone = servTelefone;
    }
     
 

    @PostMapping("/novo")
    public ResponseEntity<Telefone> cadastrarTelefone(@RequestBody Telefone telefone) {

        Telefone telefenoRetorno = _servTelefone.salvaTelefone(telefone);
                
        return new ResponseEntity<Telefone>(telefenoRetorno, HttpStatus.CREATED);
    }
}
