package com.eotia_cake_app.eotia_cake_app.services.productoService;

import com.eotia_cake_app.eotia_cake_app.models.Producto;
import com.eotia_cake_app.eotia_cake_app.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    IProductoRepository productoRepository;

    @Override
    public List<Producto> ObtenerProductos() {
        List<Producto> productos = new ArrayList<Producto>();
        productoRepository.findAll().forEach(producto -> productos.add(producto));
        return productos;
    }
    @Override
    public Producto BuscarProducto(int id) {
        return productoRepository.findById(id).get();
    }
}
