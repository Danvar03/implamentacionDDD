package com.sofka.implementacionDDD.Tienda.VideoJuego.entity;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.implementacionDDD.Tienda.VideoJuego.events.*;

public class
VideojuegoChange extends EventChange {
    public VideojuegoChange(Videojuego videojuego) {


        apply((VideojuegoModificado event)->{
            videojuego.precio = event.getPrecio();
            videojuego.descripcion = event.getDescripcion();
            videojuego.precio = event.getPrecio();
        });

        apply((VideojuegoAdquirido event)->{
            videojuego.adquirido = event.getAdquirido();
        });

          apply((ValoresDeEstadisticaActualizada event)->{
            videojuego.estadisticas.actualizarValores(event.getTotalVentas(),event.getdineroTotal());
        });

        apply((VideojuegoCreado event)->{
            videojuego.estadisticas = event.getEstadisticas();
            videojuego.precio = event.getPrecio();
            videojuego.descripcion = event.getDescripcion();
            videojuego.adquirido = event.getAdquirido();
        });

    }
}

