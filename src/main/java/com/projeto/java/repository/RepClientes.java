package com.projeto.java.repository;

import com.projeto.java.entity.Clientes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepClientes extends JpaRepository<Clientes, Integer> {
   
}
