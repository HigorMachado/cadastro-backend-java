package com.projeto.java.repository;

import com.projeto.java.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepUsuario extends JpaRepository<Usuario, Integer> {
    Usuario findByEmail(String email);
}
