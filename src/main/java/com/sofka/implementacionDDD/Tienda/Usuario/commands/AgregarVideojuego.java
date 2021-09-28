package com.sofka.implementacionDDD.Tienda.Usuario.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdUsuario;
import com.sofka.implementacionDDD.Tienda.VideoJuego.entity.Videojuego;

public class AgregarVideojuego implements Command {

    private final IdUsuario idUsuario;
    private final Videojuego videojuego;

    public AgregarVideojuego(IdUsuario idUsuario, Videojuego videojuego) {
        this.idUsuario = idUsuario;
        this.videojuego = videojuego;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }
}
