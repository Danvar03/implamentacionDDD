package com.sofka.implementacionDDD.Tienda.Compra.commands;

import com.sofka.implementacionDDD.Tienda.Compra.entity.Descuento;
import com.sofka.implementacionDDD.Tienda.Compra.values.IdCompra;

public class ModificarDescuento {
    private final IdCompra idCompra;
    private final Descuento descuento;

    public ModificarDescuento(IdCompra idCompra, Descuento descuento) {
        this.idCompra = idCompra;
        this.descuento = descuento;
    }

    public IdCompra getIdCompra() {
        return idCompra;
    }

    public Descuento getDescuento() {
        return descuento;
    }
}
