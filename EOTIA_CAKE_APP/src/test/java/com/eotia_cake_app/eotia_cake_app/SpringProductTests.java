package com.eotia_cake_app.eotia_cake_app;

import com.eotia_cake_app.eotia_cake_app.models.Producto;
import com.eotia_cake_app.eotia_cake_app.services.productoService.IProductoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SpringProductTests {

    @Autowired
    IProductoService productoService;

    @Test
    public void testGetAll (){
        List<Producto> productos = productoService.ObtenerProductos();
        assertThat(productos).size().isGreaterThan(0);
    }

    @Test
    public void testGetProductbyId(){
        Producto producto = productoService.BuscarProducto(1);
        assertEquals(50000,producto.getPrecioUnitario());
    }

    @Test
    public void testProductExist(){
        Producto producto = productoService.BuscarProducto(2);
        assertThat(producto.getId()).isNotEqualTo(null);
    }
}
