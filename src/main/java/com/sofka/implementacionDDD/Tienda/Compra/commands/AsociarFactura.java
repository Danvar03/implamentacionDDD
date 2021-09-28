package com.sofka.implementacionDDD.Tienda.Compra.commands;

import com.sofka.implementacionDDD.Tienda.Compra.values.Fecha;
import com.sofka.implementacionDDD.Tienda.Compra.values.IdCompra;
import com.sofka.implementacionDDD.Tienda.Compra.values.NumeroVideojuegos;
import com.sofka.implementacionDDD.Tienda.Compra.values.PrecioTotal;

public class AsociarFactura {
    private final IdCompra idCompra;
    private final PrecioTotal precioTotal;
    private final NumeroVideojuegos numeroVideojuegos;
    private final Fecha fecha;

    public AsociarFactura(IdCompra idCompra, PrecioTotal precioTotal, NumeroVideojuegos numeroVideojuegos, Fecha fecha) {
        this.idCompra = idCompra;
        this.precioTotal = precioTotal;
        this.numeroVideojuegos = numeroVideojuegos;
        this.fecha = fecha;
    }

    public IdCompra getIdCompra() {
        return idCompra;
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
