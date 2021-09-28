package com.sofka.implementacionDDD.Tienda.VideoJuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.TotalVentas;

public class ValoresDeEstadisticaActualizada extends DomainEvent {

    private final CantidadVentas cantidadVentas ;
    private final TotalVentas totalVentas;

    public ValoresDeEstadisticaActualizada(String type, CantidadVentas cantidadVentas, TotalVentas totalVentas) {
        super("tienda.videojuego,valoresdeestadisticaactualizados");
        this.cantidadVentas = cantidadVentas;
        this.totalVentas = totalVentas;
    }

    public CantidadVentas getCantidadVentas() {
        return cantidadVentas;
    }

    public TotalVentas getTotalVentas() {
        return totalVentas;
    }
}
