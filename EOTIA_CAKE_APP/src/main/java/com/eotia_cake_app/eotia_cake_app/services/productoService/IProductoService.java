package com.eotia_cake_app.eotia_cake_app.services.productoService;

import com.eotia_cake_app.eotia_cake_app.models.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> ObtenerProductos();
    Producto BuscarProducto(int id);
}
