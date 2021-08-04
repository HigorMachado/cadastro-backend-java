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
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoTelefone;

    @Column(unique = false, length = 20, nullable = false)
    private String numeroTelefone;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_cliente")
    private List<Cliente> clientes = new ArrayList<>();
}
