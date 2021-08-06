package com.projeto.java.repository;

import com.projeto.java.entity.Telefone;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepTelefone extends JpaRepository<Telefone, Integer> {
   
}
