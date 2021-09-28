package com.sofka.implementacionDDD.Tienda.VideoJuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.Adquirido;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.Descripcion;
import com.sofka.implementacionDDD.Tienda.genericvalues.Precio;


public class VideojuegoModificado extends DomainEvent {

    private final Precio precio;
    private final Descripcion descripcion;
    private final Adquirido adquirido;

    public VideojuegoModificado(Precio precio, Descripcion descripcion, Adquirido adquirido) {
        super("tienda.videojuego.videojuegomodificado");
        this.precio = precio;
        this.descripcion = descripcion;
        this.adquirido = adquirido;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Adquirido getAdquirido() {
        return adquirido;
    }
}
