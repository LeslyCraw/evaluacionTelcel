package com.evaluacionTelcel.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String nombre;

    @NotEmty
    private String fechaNacimiento;

    @NotEmty
    private String correo;

    private String hobieas;
}



