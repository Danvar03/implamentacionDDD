package com.sofka.implementacionDDD.Tienda.Usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdSuscripcion;
import com.sofka.implementacionDDD.Tienda.Usuario.values.InformacionSuscripcion;

public class SuscripcionAgregada extends DomainEvent {

    private final IdSuscripcion idSuscripcion;
    private final InformacionSuscripcion informacionSuscripcion;


    public SuscripcionAgregada(String type, IdSuscripcion idSuscripcion, InformacionSuscripcion informacionSuscripcion) {
        super("tienda.usuario.suscripcionagregada");
        this.idSuscripcion = idSuscripcion;
        this.informacionSuscripcion = informacionSuscripcion;
    }
}
