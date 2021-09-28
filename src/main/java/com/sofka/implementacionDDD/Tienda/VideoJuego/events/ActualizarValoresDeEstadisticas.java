package com.sofka.implementacionDDD.Tienda.VideoJuego.events;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.DineroTotal;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.IdVideojuego;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.TotalVentas;

public class ActualizarValoresDeEstadisticas implements Command {
    private final IdVideojuego idVideojuego;
    private final TotalVentas totalVentas;
    private final DineroTotal dineroRecaudado;

    public ActualizarValoresDeEstadisticas(IdVideojuego idVideojuego, TotalVentas totalVentas, DineroTotal dineroRecaudado) {
        this.idVideojuego = idVideojuego;
        this.totalVentas = totalVentas;
        this.dineroRecaudado = dineroRecaudado;
    }

    public IdVideojuego getIdVideojuego() {
        return idVideojuego;
    }

    public TotalVentas getTotalVentas() {
        return totalVentas;
    }

    public DineroTotal getDineroRecaudado() {
        return dineroRecaudado;
    }
}
