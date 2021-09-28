package com.sofka.implementacionDDD.Tienda.Usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdSuscripcion;
import com.sofka.implementacionDDD.Tienda.Usuario.values.InformacionSuscripcion;

public class SuscipcionModificada extends DomainEvent {

    private final InformacionSuscripcion informacionSuscripcion;
    private final IdSuscripcion idSuscripcion;

    public SuscipcionModificada(InformacionSuscripcion informacionSuscripcion, IdSuscripcion idSuscripcion) {
        super("tienda.usuario.suscripciontamodificada");
        this.informacionSuscripcion = informacionSuscripcion;
        this.idSuscripcion = idSuscripcion;
    }

    public InformacionSuscripcion getInformacionSuscripcion() {
        return informacionSuscripcion;
    }

    public IdSuscripcion getIdSuscripcion() {
        return idSuscripcion;
    }
}
