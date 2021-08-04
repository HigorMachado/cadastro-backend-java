package com.projeto.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoTelefone;

    @Column(unique = false, length = 20, nullable = false)
    private String numeroTelefone;

    @Column(nullable = false)
    private int codigoUsuario;
}
