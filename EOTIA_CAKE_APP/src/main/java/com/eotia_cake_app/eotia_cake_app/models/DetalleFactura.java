package com.eotia_cake_app.eotia_cake_app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "detallefactura")
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private int id;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    @Getter @Setter
    private Producto producto;

    @Getter @Setter @Column(name = "cantidad")
    private int cantidad;

    @Getter @Column(name = "precio")
    private double precio;

    public void CalcularPrecio(){
        this.precio = this.cantidad * this.producto.getPrecioUnitario();
    }
}
