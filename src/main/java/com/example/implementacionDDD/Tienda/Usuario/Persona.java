package com.example.implementacionDDD.Tienda.Usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.implementacionDDD.Tienda.Usuario.values.IdPersona;

public class Persona extends AggregateEvent<IdPersona> {
    public Persona(IdPersona entityId) {
        super(entityId);
    }
}
