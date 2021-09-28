package com.sofka.implementacionDDD.Tienda.VideoJuego.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.Adquirido;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.IdVideojuego;

public class AdquirirVideojuego implements Command {

    private final IdVideojuego idVideojuego;
    private final Adquirido adquirido;

    public AdquirirVideojuego(IdVideojuego idVideojuego, Adquirido adquirido) {
        this.idVideojuego = idVideojuego;
        this.adquirido = adquirido;
    }

    public IdVideojuego getIdVideojuego() {
        return idVideojuego;
    }

    public Adquirido getAdquirido() {
        return adquirido;
    }
}
