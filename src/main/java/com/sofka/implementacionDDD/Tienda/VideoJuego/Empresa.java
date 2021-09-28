package com.sofka.implementacionDDD.Tienda.VideoJuego;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.IdEmpresa;


public class Empresa extends AggregateEvent<IdEmpresa> {
    public Empresa(IdEmpresa entityId) {
        super(entityId);
    }
}
