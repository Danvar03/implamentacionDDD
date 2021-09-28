package com.sofka.implementacionDDD.Tienda.VideoJuego.values;

import co.com.sofka.domain.generic.Identity;

public class IdEmpresa extends Identity {
    public IdEmpresa(String uuid) {
        super(uuid);
    }

    public IdEmpresa() {
    }

    public static IdEmpresa of(String id){
        return new IdEmpresa(id);
    }
}
