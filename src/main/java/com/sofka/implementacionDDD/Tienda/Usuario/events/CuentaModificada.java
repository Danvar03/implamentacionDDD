package com.sofka.implementacionDDD.Tienda.Usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Usuario.Cuenta;

public class CuentaModificada extends DomainEvent {
    private final Cuenta cuenta;
    public CuentaModificada(Cuenta cuenta) {
        super("tienda.usuario.cuentamodificada");
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta(){
        return this.cuenta;
    }
}
