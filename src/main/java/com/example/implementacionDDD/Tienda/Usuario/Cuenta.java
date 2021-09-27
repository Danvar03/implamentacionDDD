package com.example.implementacionDDD.Tienda.Usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.implementacionDDD.Tienda.Usuario.values.IdCuenta;

public class Cuenta extends AggregateEvent<IdCuenta> {
    public Cuenta(IdCuenta entityId) {
        super(entityId);
    }
}
