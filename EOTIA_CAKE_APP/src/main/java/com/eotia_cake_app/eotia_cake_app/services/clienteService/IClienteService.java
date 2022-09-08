package com.eotia_cake_app.eotia_cake_app.services.clienteService;

import com.eotia_cake_app.eotia_cake_app.models.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> ObtenerClientes();
    Cliente BuscarCliente(String id);
    void RegistrarCliente(Cliente cliente);
}
