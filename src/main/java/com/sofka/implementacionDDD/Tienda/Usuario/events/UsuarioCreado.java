package com.sofka.implementacionDDD.Tienda.Usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Usuario.entity.Cuenta;
import com.sofka.implementacionDDD.Tienda.Usuario.entity.Suscripcion;
import com.sofka.implementacionDDD.Tienda.VideoJuego.entity.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class UsuarioCreado extends DomainEvent {

    private final Cuenta cuenta;
    private final List<Suscripcion> suscripcions;
    private final List<Videojuego> videojuegos;

    public UsuarioCreado(Cuenta cuenta) {
        super("tienda.usuario.usuariocreado");
        this.cuenta = cuenta;
        this.suscripcions = new ArrayList<>();
        this.videojuegos = new ArrayList<>();
    }

    public Cuenta getCuenta(){
        return this.cuenta;
    }

    public List<Suscripcion> getSuscripcions() {
        return suscripcions;
    }

    public List<Videojuego> getVideojuegos(){
        return this.videojuegos;
    }
}

