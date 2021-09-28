package com.sofka.implementacionDDD.Tienda.Usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdSuscripcion;

public class Suscripcion extends AggregateEvent<IdSuscripcion> {
    public Suscripcion(IdSuscripcion entityId) {
        super(entityId);
    }
}
