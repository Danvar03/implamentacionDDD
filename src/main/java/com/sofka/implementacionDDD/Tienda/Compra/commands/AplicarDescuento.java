package com.sofka.implementacionDDD.Tienda.Compra.commands;

import com.sofka.implementacionDDD.Tienda.Compra.values.Fecha;
import com.sofka.implementacionDDD.Tienda.Compra.values.IdCompra;
import com.sofka.implementacionDDD.Tienda.Compra.values.Porcentaje;

public class AplicarDescuento {
    private final IdCompra idCompra;
    private final Fecha fechaLimite;
    private final Porcentaje porcentaje;

    public AplicarDescuento(IdCompra idCompra, Fecha fechaLimite, Porcentaje porcentaje) {
        this.idCompra = idCompra;
        this.fechaLimite = fechaLimite;
        this.porcentaje = porcentaje;
    }

    public IdCompra getIdCompra() {
        return idCompra;
    }
}
