package com.sofka.implementacionDDD.Tienda.Compra.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.Compra.values.IdCompra;
import com.sofka.implementacionDDD.Tienda.VideoJuego.Videojuego;

public final class AgregarVideoJuegoCompra implements Command {
    private final IdCompra idCompra;
    private final Videojuego videojuego;

    public AgregarVideoJuegoCompra(IdCompra idCompra, Videojuego videojuego) {
        this.idCompra = idCompra;
        this.videojuego = videojuego;
    }

    public IdCompra getIdCompra() {
        return idCompra;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }
}
