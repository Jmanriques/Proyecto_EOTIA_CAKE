package com.eotia_cake_app.eotia_cake_app.repository;

import com.eotia_cake_app.eotia_cake_app.models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturaRepository extends JpaRepository<Factura, Integer> {
}
