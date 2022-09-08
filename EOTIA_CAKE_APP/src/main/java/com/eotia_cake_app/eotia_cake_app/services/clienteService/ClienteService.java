package com.eotia_cake_app.eotia_cake_app.services.clienteService;

import com.eotia_cake_app.eotia_cake_app.models.Cliente;
import com.eotia_cake_app.eotia_cake_app.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    IClienteRepository clienteRepositoy;

    @Override
    public List<Cliente> ObtenerClientes() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        clienteRepositoy.findAll().forEach(cliente -> clientes.add(cliente));
        return clientes;
    }

    @Override
    public Cliente BuscarCliente(String id) {
        return clienteRepositoy.findById(id).get();
    }

    @Override
    public void RegistrarCliente(Cliente cliente) {
        clienteRepositoy.save(cliente);
    }
}
