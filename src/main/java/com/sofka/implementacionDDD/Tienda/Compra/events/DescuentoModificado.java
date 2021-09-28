package com.sofka.implementacionDDD.Tienda.Compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Compra.entity.Descuento;

public class DescuentoModificado  extends DomainEvent {
    private final Descuento descuento;

    public DescuentoModificado(Descuento descuento) {
        super("tienda.compra.descuentomodificado");

        this.descuento = descuento;
    }

    public Descuento getDescuento() {
        return descuento;
    }
}
