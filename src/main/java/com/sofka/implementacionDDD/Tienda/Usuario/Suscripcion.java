package com.sofka.implementacionDDD.Tienda.Usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdSuscripcion;
import com.sofka.implementacionDDD.Tienda.Usuario.values.InformacionSuscripcion;

import java.util.Objects;

public class Suscripcion extends AggregateEvent<IdSuscripcion> {
    protected InformacionSuscripcion informacionSuscripcion;

    public Suscripcion(IdSuscripcion entityId, InformacionSuscripcion informacionSuscripcion) {
        super(entityId);
        this.informacionSuscripcion = informacionSuscripcion;

    } public void modificarInformacionSuscripcion(InformacionSuscripcion informacionSuscripcion){
        this.informacionSuscripcion = Objects.requireNonNull(informacionSuscripcion);
    }
    public InformacionSuscripcion informacionSuscripcion(){
        return this.informacionSuscripcion;
    }
}

