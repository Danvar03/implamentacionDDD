package com.example.implementacionDDD.Tienda.Compra;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.implementacionDDD.Tienda.Compra.values.IdDescuento;

public class Descuento extends AggregateEvent<IdDescuento> {
    public Descuento(IdDescuento entityId) {
        super(entityId);
    }
}
