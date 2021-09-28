package com.sofka.implementacionDDD.Tienda.Compra.entity;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.implementacionDDD.Tienda.Compra.events.*;

public class  CompraChange extends EventChange {
    public CompraChange(Compra compra) {

        apply((DescuentoAplicado event)->{
            compra.descuento.modificarFechaLimite(event.getFechaLimite());
            compra.descuento.modificarPorcentaje(event.getPorcentaje());
        });

        apply((FacturaAsociada event)->{
            compra.factura.modificarFecha(event.getFecha());
            compra.factura.modificarNumeroVideojuegos(event.getNumeroVideojuegos());
            compra.factura.modificarPrecioTotal(event.getPrecioTotal());
        });

        apply((FacturaModificada event)->{
            compra.factura = event.getFactura();
        });

        apply((DescuentoModificado event)->{
            compra.descuento = event.getDescuento();
        });

        apply((VideojuegoAgregadoCompra event)->{
            compra.videojuegos.add(event.getVideojuego());
        });

    }
}