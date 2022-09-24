package com.eotia_cake_app.eotia_cake_app.services.facturaservice;

import com.eotia_cake_app.eotia_cake_app.models.DetalleFactura;
import com.eotia_cake_app.eotia_cake_app.models.Factura;
import com.eotia_cake_app.eotia_cake_app.repository.IFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacturaService implements IFacturaService {
    @Autowired
    IFacturaRepository facturaRepository;

    @Override
    public List<Factura> ObtenerFacturas() {
        List<Factura> facturas = new ArrayList<Factura>();
        facturaRepository.findAll().forEach(factura -> facturas.add(factura));
        return facturas;
    }

    @Override
    public Factura BuscarFactura(int id) {
        return facturaRepository.findById(id).get();
    }

    @Override
    public void RegistrarFactura(Factura factura) {
        List<DetalleFactura> detalleFacturas = factura.getDetalleFacturas();
        detalleFacturas.forEach(DetalleFactura::CalcularPrecio);
        factura.setDetalleFacturas(detalleFacturas);
        factura.CalcularTotal();
        facturaRepository.save(factura);
    }
}
