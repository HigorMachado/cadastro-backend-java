package com.projeto.java.service;

import com.projeto.java.entity.Usuario;
import com.projeto.java.error.ResourceNotFound;
import com.projeto.java.repository.RepUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServUsuario {
    private final RepUsuario _repUsuario;

    @Autowired
    public ServUsuario(RepUsuario repUsuario) {
        this._repUsuario = repUsuario;
    }

    public Usuario salvaUsuario(Usuario usuario) {
        return _repUsuario.saveAndFlush(usuario);
    }

    public void validaDadosUsuario(Usuario usuario) {
        if (usuario.getEmail().isEmpty()) {
            throw new ResourceNotFound("E-mail obrigatório.");
        }

        if (usuario.getSenha().isEmpty()) {
            throw new ResourceNotFound("Senha obrigatório.");
        }
    }

    public Usuario existeEmailCadastrado(String email) {
        
        return _repUsuario.findByEmail(email);
    }
}
