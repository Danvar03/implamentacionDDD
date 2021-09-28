package com.sofka.implementacionDDD.Tienda.Usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Usuario.events.*;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdSuscripcion;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdUsuario;
import com.sofka.implementacionDDD.Tienda.Usuario.values.InformacionSuscripcion;
import com.sofka.implementacionDDD.Tienda.VideoJuego.Videojuego;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Usuario extends AggregateEvent<IdUsuario> {

    protected List<Suscripcion> suscripcions;
    protected Cuenta cuenta;
    protected List<Videojuego> videojuegos;

    public Usuario(IdUsuario entityId, Cuenta cuenta) {
        super(entityId);
        appendChange(new UsuarioCreado(cuenta)).apply();
    }

    private Usuario(IdUsuario entityId){
        super(entityId);
        subscribe(new UsuarioChange(this));
    }

    public static Usuario from(IdUsuario idUsuario, List<DomainEvent> events){
        var usuario = new Usuario(idUsuario);
        events.forEach(usuario::applyEvent);
        return usuario;
    }

    public void agregarTarjeta(IdSuscripcion entityId, InformacionSuscripcion informacionSuscripcion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacionSuscripcion);
        appendChange(new SuscripcionAgregada(entityId,informacionSuscripcion)).apply();
    }

    public void agregarVideojuego(Videojuego videojuego){
        Objects.requireNonNull(videojuego);
        appendChange(new VideojuegoAgregado(videojuego)).apply();
    }

    public void validarCuenta(Cuenta cuenta){
        Objects.requireNonNull(cuenta);
        appendChange(new CuentaValidada(cuenta)).apply();
    }

    public void modificarTarjeta(InformacionSuscripcion informacionSuscripcion, IdSuscripcion idSuscripcion){
        Objects.requireNonNull(informacionSuscripcion);
        Objects.requireNonNull(idSuscripcion);
        appendChange(new SuscipcionModificada(informacionSuscripcion, idSuscripcion)).apply();
    }

    public void modificarCuenta(Cuenta cuenta){
        Objects.requireNonNull(cuenta);
        appendChange(new CuentaModificada(cuenta)).apply();
    }
    protected Optional<Suscripcion> getTarjetaById(IdSuscripcion idSuscripcion){
        return suscripcion().stream().filter(tarjeta -> tarjeta.identity().equals(idSuscripcion)).findFirst();
    }

    public List<Suscripcion> suscripcion(){
        return this.suscripcions;
    }

    public List<Videojuego> videojuegos(){
        return this.videojuegos;
    }

    public Cuenta cuenta(){
        return this.cuenta;
    }
}