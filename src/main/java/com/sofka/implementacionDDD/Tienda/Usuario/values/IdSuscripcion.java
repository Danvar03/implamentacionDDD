package com.sofka.implementacionDDD.Tienda.Usuario.values;

import co.com.sofka.domain.generic.Identity;

public class IdSuscripcion extends Identity {
    public IdSuscripcion(String id) {
        super(id);
    }

    public IdSuscripcion() {
    }

    public static IdSuscripcion of(String id){
        return new IdSuscripcion(id);
    }
}