package com.example.implementacionDDD.Tienda.Compra;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.implementacionDDD.Tienda.Compra.values.IdFactura;

public class Factura extends AggregateEvent<IdFactura> {
    public Factura(IdFactura entityId) {
        super(entityId);
    }
}
