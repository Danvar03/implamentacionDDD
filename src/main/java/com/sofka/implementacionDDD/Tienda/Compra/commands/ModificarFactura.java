package com.sofka.implementacionDDD.Tienda.Compra.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.Compra.entity.Factura;
import com.sofka.implementacionDDD.Tienda.Compra.values.IdCompra;

public class ModificarFactura implements Command {
    private final IdCompra idCompra;
    private final Factura factura;


    public ModificarFactura(IdCompra idCompra, Factura factura) {
        this.idCompra = idCompra;
        this.factura = factura;
    }

    public IdCompra getIdCompra() {
        return idCompra;
    }

    public Factura getFactura() {
        return factura;
    }
}
