package com.sofka.implementacionDDD.Tienda.Usuario.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdSuscripcion;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdUsuario;
import com.sofka.implementacionDDD.Tienda.Usuario.values.InformacionSuscripcion;


public class AgregarSuscripcion implements Command {

    private final IdUsuario idUsuario;
    private final InformacionSuscripcion informacionSuscripcion ;
    private final IdSuscripcion idTarjeta;

    public AgregarSuscripcion(IdUsuario idUsuario, InformacionSuscripcion informacionSuscripcion, IdSuscripcion idTarjeta) {
        this.idUsuario = idUsuario;
        this.informacionSuscripcion = informacionSuscripcion;
        this.idTarjeta = idTarjeta;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public InformacionSuscripcion getInformacionSuscripcion() {
        return informacionSuscripcion;
    }

    public IdSuscripcion getIdTarjeta() {
        return idTarjeta;
    }
}
