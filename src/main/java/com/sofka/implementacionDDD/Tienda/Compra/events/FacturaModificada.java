package com.sofka.implementacionDDD.Tienda.Compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Compra.entity.Factura;

public class FacturaModificada extends DomainEvent {
    private final Factura factura;


    public FacturaModificada(Factura factura) {
        super("tienda.compra.facturamodificada");
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }
}
