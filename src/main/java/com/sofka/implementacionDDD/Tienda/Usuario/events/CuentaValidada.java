package com.sofka.implementacionDDD.Tienda.Usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Usuario.Cuenta;

public class CuentaValidada extends DomainEvent {
    private final Cuenta cuenta;

    public CuentaValidada(Cuenta cuenta) {
        super("tienda.usuario.cuentavalidada");
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta(){
        return this.cuenta;
    }
}
