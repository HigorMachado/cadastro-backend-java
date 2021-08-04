package com.projeto.java.repository;

import com.projeto.java.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepCliente extends JpaRepository<Cliente, Integer> {
   
}
