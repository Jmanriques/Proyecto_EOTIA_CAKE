package com.eotia_cake_app.eotia_cake_app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private int id;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    @Getter @Setter
    private Cliente cliente;

    @Getter @Setter @Column(name = "fecha")
    private Date fecha;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "idFactura")
    @Getter @Setter
    private List<DetalleFactura> detalleFacturas;

    @Getter @Setter @Column(name = "total")
    private double total;

    public void CalcularTotal(){
        for (int i=0;i< this.detalleFacturas.size(); i++){
            this.total += this.detalleFacturas.get(i).getPrecio();
        }
    }


}
