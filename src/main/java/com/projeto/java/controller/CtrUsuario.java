package com.projeto.java.controller;

import com.projeto.java.entity.Usuario;
import com.projeto.java.error.ResourceNotFound;
import com.projeto.java.service.ServUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/usuario")
public class CtrUsuario {

    private final ServUsuario _servUsuario;

    @Autowired
    public CtrUsuario(ServUsuario servUsuario) {
        this._servUsuario = servUsuario;
    }

    @PostMapping("/novo")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {

        _servUsuario.validaDadosUsuario(usuario);

        Usuario usuarioEmail = _servUsuario.existeEmailCadastrado(usuario.getEmail());

        if (usuarioEmail != null) {
            throw new ResourceNotFound("Este e-mail ja esta cadastrado.");
        }

        Usuario usuarioRetorno = _servUsuario.salvaUsuario(usuario);

        if (usuarioRetorno == null) {
            throw new ResourceNotFound("Erro ao cadastrar usuário.");
        }

        return new ResponseEntity<Usuario>(usuarioRetorno, HttpStatus.CREATED);
    }
}
