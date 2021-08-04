package com.projeto.java.repository;

import com.projeto.java.entity.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepEndereco extends JpaRepository<Endereco, Integer> {
   
}
