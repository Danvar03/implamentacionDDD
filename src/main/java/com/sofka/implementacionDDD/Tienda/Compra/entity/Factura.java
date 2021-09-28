package com.sofka.implementacionDDD.Tienda.Compra.entity;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionDDD.Tienda.Compra.values.Fecha;
import com.sofka.implementacionDDD.Tienda.Compra.values.IdFactura;
import com.sofka.implementacionDDD.Tienda.Compra.values.NumeroVideojuegos;
import com.sofka.implementacionDDD.Tienda.Compra.values.PrecioTotal;

public class Factura extends AggregateEvent<IdFactura> {
    protected PrecioTotal precioTotal;
    protected NumeroVideojuegos numeroVideojuegos;
    protected Fecha fecha;

    public Factura(IdFactura entityId, PrecioTotal precioTotal, NumeroVideojuegos numeroVideojuegos, Fecha fecha) {
        super(entityId);
        this.precioTotal = precioTotal;
        this.numeroVideojuegos = numeroVideojuegos;
        this.fecha = fecha;
    }

    public void modificarPrecioTotal(PrecioTotal precioTotal){
        this.precioTotal = precioTotal;
    }

    public void modificarNumeroVideojuegos(NumeroVideojuegos numeroVideojuegos){
        this.numeroVideojuegos = numeroVideojuegos;
    }

    public void modificarFecha(Fecha fecha){
        this.fecha = fecha;
    }

    public PrecioTotal precioTotal() {
        return precioTotal;
    }

    public NumeroVideojuegos numeroVideojuegos() {
        return numeroVideojuegos;
    }

    public Fecha fecha() {
        return fecha;
    }
}