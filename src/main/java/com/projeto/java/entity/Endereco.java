package com.projeto.java.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoEndereco;

    @Column(unique = true, length = 100, nullable = false)
    private String nomeEndereco; 

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_cliente")
    private List<Cliente> clientes = new ArrayList<>();
}