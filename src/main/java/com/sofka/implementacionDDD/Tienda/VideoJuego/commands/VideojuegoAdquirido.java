package com.sofka.implementacionDDD.Tienda.VideoJuego.commands;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.Adquirido;

public class VideojuegoAdquirido extends DomainEvent {

    private final Adquirido adquirido;

    public VideojuegoAdquirido(Adquirido adquirido) {
        super("tienda.videojuegos.videojuegoadquirido");
        this.adquirido = adquirido;
    }

    public Adquirido getAdquirido() {
        return adquirido;
    }
}
