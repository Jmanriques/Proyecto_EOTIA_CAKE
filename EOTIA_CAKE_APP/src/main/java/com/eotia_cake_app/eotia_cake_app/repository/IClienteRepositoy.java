package com.eotia_cake_app.eotia_cake_app.repository;

import com.eotia_cake_app.eotia_cake_app.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClienteRepositoy extends JpaRepository<Cliente, String> {
}
