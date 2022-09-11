package com.eotia_cake_app.eotia_cake_app.controllers;

import com.eotia_cake_app.eotia_cake_app.models.Cliente;
import com.eotia_cake_app.eotia_cake_app.services.clienteService.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @RequestMapping(value = "api/cliente", method = RequestMethod.GET)
    public List<Cliente> GetAllClientes(){
        return clienteService.ObtenerClientes();
    }

    @RequestMapping(value = "api/cliente/{id}", method = RequestMethod.GET)
    public Cliente FindById(@PathVariable String id){
        return clienteService.BuscarCliente(id);
    }

    @RequestMapping(value = "api/cliente", method = RequestMethod.POST)
    public String RegistrarCliente(@RequestBody Cliente cliente){
        clienteService.RegistrarCliente(cliente);
        return "Usuario Registrado";
    }


}
