package com.sofka.implementacionDDD.Tienda.Usuario.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.Usuario.entity.Cuenta;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdUsuario;

public class ModificarCuenta implements Command {
    private final IdUsuario idUsuario;
    private final Cuenta cuenta;


    public ModificarCuenta(IdUsuario idUsuario, Cuenta cuenta) {
        this.idUsuario = idUsuario;
        this.cuenta = cuenta;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
