package com.eotia_cake_app.eotia_cake_app.services.facturaservice;

import com.eotia_cake_app.eotia_cake_app.models.Factura;

import java.util.List;

public interface IFacturaService {
    List<Factura> ObtenerFacturas();
    Factura BuscarFactura(int id);
    void RegistrarFactura(Factura factura);
}
