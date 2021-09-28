package com.sofka.implementacionDDD.Tienda.VideoJuego.values;

import co.com.sofka.domain.generic.Identity;

public class IdEstadistica extends Identity {
    public IdEstadistica(String uuid) {
        super(uuid);
    }

    public IdEstadistica() {
    }

    public static IdEstadistica of(String id){
        return new IdEstadistica(id);
    }
}
