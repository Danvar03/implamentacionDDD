package com.sofka.implementacionDDD.Tienda.Usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdCuenta;

public class Cuenta extends AggregateEvent<IdCuenta> {
    public Cuenta(IdCuenta entityId) {
        super(entityId);
    }
}
