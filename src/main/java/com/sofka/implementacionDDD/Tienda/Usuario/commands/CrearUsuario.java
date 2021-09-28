package com.sofka.implementacionDDD.Tienda.Usuario.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.Usuario.entity.Cuenta;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdUsuario;


public class CrearUsuario implements Command {
    private final IdUsuario entityId;
    private final Cuenta cuenta;

    public CrearUsuario(IdUsuario entityId, Cuenta cuenta) {
        this.entityId = entityId;
        this.cuenta = cuenta;
    }

    public IdUsuario getEntityId() {
        return entityId;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
