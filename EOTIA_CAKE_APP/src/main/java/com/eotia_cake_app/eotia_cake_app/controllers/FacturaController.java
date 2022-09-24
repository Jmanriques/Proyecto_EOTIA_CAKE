package com.eotia_cake_app.eotia_cake_app.controllers;

import com.eotia_cake_app.eotia_cake_app.models.Cliente;
import com.eotia_cake_app.eotia_cake_app.models.Factura;
import com.eotia_cake_app.eotia_cake_app.services.clienteService.IClienteService;
import com.eotia_cake_app.eotia_cake_app.services.facturaservice.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacturaController {
    @Autowired
    private IFacturaService facturaService;

    @RequestMapping(value = "api/factura", method = RequestMethod.GET)
    public List<Factura> GetAllFacturas(){
        return facturaService.ObtenerFacturas();
    }

    @RequestMapping(value = "api/factura/{id}", method = RequestMethod.GET)
    public Factura FindById(@PathVariable int id){
        return facturaService.BuscarFactura(id);
    }

    @RequestMapping(value = "api/factura", method = RequestMethod.POST)
    public String RegistrarFactura(@RequestBody Factura factura){
        facturaService.RegistrarFactura(factura);
        return " Factura Registrada";
    }
}
