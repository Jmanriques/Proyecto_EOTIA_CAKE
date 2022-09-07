package com.eotia_cake_app.eotia_cake_app.controllers;

import com.eotia_cake_app.eotia_cake_app.models.Producto;

import com.eotia_cake_app.eotia_cake_app.services.productoService.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @RequestMapping(value = "api/producto", method = RequestMethod.GET)
    public List<Producto> ObtenerProductos(){
        return productoService.ObtenerProductos();
    }

    @RequestMapping(value = "api/producto/{id}", method = RequestMethod.GET)
    public Producto BuscarProducto(@PathVariable int id){
        return productoService.BuscarProducto(id);
    }
}
