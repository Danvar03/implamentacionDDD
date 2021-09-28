package com.sofka.implementacionDDD.Tienda.Usuario.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdSuscripcion;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdUsuario;
import com.sofka.implementacionDDD.Tienda.Usuario.values.InformacionSuscripcion;


public class ModificarSuscripcion implements Command {
    private final IdUsuario idUsuario;
    private final InformacionSuscripcion informacionSuscripcion;
    private final IdSuscripcion idSuscripcion;

    public ModificarSuscripcion(IdUsuario idUsuario, InformacionSuscripcion informacionSuscripcion, IdSuscripcion idSuscripcion) {
        this.idUsuario = idUsuario;
        this.informacionSuscripcion = informacionSuscripcion;
        this.idSuscripcion = idSuscripcion;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public InformacionSuscripcion getInformacionSuscripcion() {
        return informacionSuscripcion;
    }

    public IdSuscripcion getIdSuscripcion() {
        return idSuscripcion;
    }
}

