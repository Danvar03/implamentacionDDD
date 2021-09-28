package com.sofka.implementacionDDD.Tienda.VideoJuego;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.IdVideojuego;

public class Videojuego extends AggregateEvent<IdVideojuego> {

    public Videojuego(IdVideojuego entityId) {
        super(entityId);
    }



}
