package com.example.implementacionDDD.Tienda.Compra;
import co.com.sofka.domain.generic.AggregateEvent;
import com.example.implementacionDDD.Tienda.Compra.values.IdCompra;
import com.example.implementacionDDD.Tienda.Compra.values.NumeroVideoJuego;
import com.example.implementacionDDD.Tienda.Compra.values.PrecioTotal;

import java.util.Set;


public class Compra extends AggregateEvent<IdCompra> {
    protected  PrecioTotal precioTotal;
    protected Set<Factura> factura;
    protected Descuento descuento;


    public Compra(IdCompra entityId, PrecioTotal precioTotal, NumeroVideoJuego numeroVideoJuego) {
        super(entityId);
    }

}
