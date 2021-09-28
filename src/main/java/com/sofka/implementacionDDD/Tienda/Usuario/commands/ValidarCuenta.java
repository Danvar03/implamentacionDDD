package com.sofka.implementacionDDD.Tienda.Usuario.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.Compra.values.Correo;
import com.sofka.implementacionDDD.Tienda.Usuario.values.Clave;

public class ValidarCuenta implements Command {

    private final Correo correo;
    private final Clave clave;

    public ValidarCuenta(Correo correo, Clave clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public Correo getCorreo() {
        return correo;
    }

    public Clave getClave() {
        return clave;
    }
}
