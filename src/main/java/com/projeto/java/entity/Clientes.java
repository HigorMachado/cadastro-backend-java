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
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoCliente;

    @Column(unique = true, length = 100, nullable = false)
    private String nomeCliente;

    @Column(nullable = false)
    private String inscricao;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String telefone;

    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn(name = "codigo_cliente")
    // private List<Telefone> telefones = new ArrayList<>();

    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn(name = "codigo_cliente")
    // private List<Endereco> enderecos = new ArrayList<>();
}
