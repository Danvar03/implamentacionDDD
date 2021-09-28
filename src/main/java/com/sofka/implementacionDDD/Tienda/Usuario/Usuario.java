package com.sofka.implementacionDDD.Tienda.Usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdUsuario;

public class Usuario extends AggregateEvent<IdUsuario> {
    public Usuario(IdUsuario entityId) {
        super(entityId);
    }
}
