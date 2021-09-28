package com.sofka.implementacionDDD.Tienda.Compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Compra.values.Fecha;
import com.sofka.implementacionDDD.Tienda.Compra.values.NumeroVideojuegos;
import com.sofka.implementacionDDD.Tienda.Compra.values.PrecioTotal;

public class FacturaAsociada extends DomainEvent {
    private final PrecioTotal precioTotal;
    private final NumeroVideojuegos numeroVideojuegos;
    private final Fecha fecha;

    public FacturaAsociada( PrecioTotal precioTotal, NumeroVideojuegos numeroVideojuegos, Fecha fecha) {
        super("tienda.compra.facturaasociada");
        this.precioTotal = precioTotal;
        this.numeroVideojuegos = numeroVideojuegos;
        this.fecha = fecha;
    }


    public PrecioTotal getPrecioTotal() {
        return precioTotal;
    }

    public NumeroVideojuegos getNumeroVideojuegos() {
        return numeroVideojuegos;
    }

    public Fecha getFecha() {
        return fecha;
    }
}

