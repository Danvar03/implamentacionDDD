package com.sofka.implementacionDDD.Tienda.VideoJuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.DineroTotal;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.TotalVentas;

public class ValoresDeEstadisticaActualizada extends DomainEvent {

    private final DineroTotal dineroTotal ;
    private final TotalVentas totalVentas;

    public ValoresDeEstadisticaActualizada(String type, DineroTotal cantidadVentas, TotalVentas totalVentas) {
        super("tienda.videojuego,valoresdeestadisticaactualizados");
        this.dineroTotal = cantidadVentas;
        this.totalVentas = totalVentas;
    }

    public DineroTotal getdineroTotal() {
        return dineroTotal;
    }

    public TotalVentas getTotalVentas() {
        return totalVentas;
    }
}
