package com.sofka.implementacionDDD.Tienda.VideoJuego.entity;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.IdEmpresa;
import com.sofka.implementacionDDD.Tienda.genericvalues.Nombre;

import java.util.Objects;

public class Empresa extends AggregateEvent<IdEmpresa> {

    protected Nombre nombre;

    public Empresa(IdEmpresa entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public void cambiarNombreEmpresa(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Nombre nombre() {
        return nombre;
    }
}
