package com.eotia_cake_app.eotia_cake_app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private int id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;
    @Getter @Setter @Column
    private double precioUnitario;
    @Getter @Setter @Column(name = "categoria")
    private String categoria;
    @Getter @Setter @Column(name = "img")
    private String img;


}
