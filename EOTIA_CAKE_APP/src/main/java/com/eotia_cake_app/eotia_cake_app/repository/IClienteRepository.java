package com.eotia_cake_app.eotia_cake_app.repository;

import com.eotia_cake_app.eotia_cake_app.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, String> {
}
