package com.sofka.implementacionDDD.Tienda.Compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.Videojuego;

public class VideojuegoAgregadoCompra extends DomainEvent {
    private final Videojuego videojuego;


    public VideojuegoAgregadoCompra( Videojuego videojuego) {
        super("tienda.compra.videojuegoagregadocompra");
        this.videojuego = videojuego;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }
}

