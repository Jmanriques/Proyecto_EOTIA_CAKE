package com.eotia_cake_app.eotia_cake_app.repository;

import com.eotia_cake_app.eotia_cake_app.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {
}
