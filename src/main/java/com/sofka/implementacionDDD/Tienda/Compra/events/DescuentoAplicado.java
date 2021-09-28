package com.sofka.implementacionDDD.Tienda.Compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Compra.values.Fecha;
import com.sofka.implementacionDDD.Tienda.Compra.values.Porcentaje;

public class DescuentoAplicado extends DomainEvent {
    private final Fecha fechaLimite;
    private final Porcentaje porcentaje;

    public DescuentoAplicado(Fecha fechaLimite, Porcentaje porcentaje) {
        super("tienda.compra.descuentoaplicado");
        this.fechaLimite = fechaLimite;
        this.porcentaje = porcentaje;
    }

    public Fecha getFechaLimite() {
        return fechaLimite;
    }

    public Porcentaje getPorcentaje() {
        return porcentaje;
    }
}
