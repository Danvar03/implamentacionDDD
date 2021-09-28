package com.sofka.implementacionDDD.Tienda.Usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.entity.Videojuego;

public class VideojuegoAgregado extends DomainEvent {

    private final Videojuego videojuego;

    public VideojuegoAgregado(Videojuego videojuego) {
        super("tienda.usuario.videojuegoagregado");
        this.videojuego = videojuego;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }
}
