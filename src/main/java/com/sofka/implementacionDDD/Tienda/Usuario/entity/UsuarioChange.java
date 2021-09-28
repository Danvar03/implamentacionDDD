package com.sofka.implementacionDDD.Tienda.Usuario.entity;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.implementacionDDD.Tienda.Usuario.events.*;

public class UsuarioChange extends EventChange {
    public UsuarioChange(Usuario usuario) {

        apply((UsuarioCreado event) ->{
            usuario.cuenta = event.getCuenta();
            usuario.suscripcions = event.getSuscripcions();
            usuario.videojuegos = event.getVideojuegos();
        });

        apply((CuentaModificada event)->{
            usuario.cuenta = event.getCuenta();
        });

        apply((SuscipcionModificada event)->{
            var suscripcion = usuario.getTarjetaById(event.getIdSuscripcion()).orElseThrow(()->(new IllegalArgumentException("No se encontro la suscripcion")));
            suscripcion.modificarInformacionSuscripcion(event.getInformacionSuscripcion());
        });

        apply((CuentaValidada event)->{
            usuario.cuenta = event.getCuenta();
        });

        apply((VideojuegoAgregado event)->{
            usuario.videojuegos.add(event.getVideojuego());
        });

        apply((SuscripcionAgregada event)->{
            usuario.suscripcions.add(new Suscripcion(event.getIdSuscripcion(),event.getInformacionSuscripcion()));
        });

    }
}