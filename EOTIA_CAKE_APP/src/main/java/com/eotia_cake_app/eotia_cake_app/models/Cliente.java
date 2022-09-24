package com.eotia_cake_app.eotia_cake_app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Getter @Setter @Column(name = "identificacion")
    private String identificacion;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "apellido")
    private String apellido;
    @Getter @Setter @Column(name = "correo")
    private String correo;
    @Getter @Setter @Column(name = "telefono")
    private String telefono;
}
