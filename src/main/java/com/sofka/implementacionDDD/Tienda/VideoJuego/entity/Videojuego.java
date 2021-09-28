package com.sofka.implementacionDDD.Tienda.VideoJuego.entity;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.events.VideojuegoAdquirido;
import com.sofka.implementacionDDD.Tienda.VideoJuego.events.VideojuegoCreado;
import com.sofka.implementacionDDD.Tienda.VideoJuego.events.VideojuegoModificado;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.*;
import com.sofka.implementacionDDD.Tienda.genericvalues.Precio;

import java.util.List;
import java.util.Objects;

public class Videojuego extends AggregateEvent<IdVideojuego> {


    protected Empresa desarrollador;
    protected Estadisticas estadisticas;
    protected Precio precio;
    protected Descripcion descripcion;
    protected Adquirido adquirido;

    public Videojuego(IdVideojuego entityId, Empresa empresa, Estadisticas estadisticas, Precio precio, Descripcion descripcion, Adquirido adquirido) {
        super(entityId);
        appendChange(new VideojuegoCreado(desarrollador,estadisticas,precio,descripcion,adquirido)).apply();
    }

    public Videojuego(IdVideojuego entityId) {
        super(entityId);
        subscribe(new VideojuegoChange(this));
    }

    public static Videojuego from(IdVideojuego idVideojuego, List<DomainEvent> events){
        var videojuego = new Videojuego(idVideojuego);
        events.forEach(videojuego::applyEvent);
        return videojuego;
    }

    public void modificarVideojuego(Precio precio, Descripcion descripcion, Adquirido adquirido){
        Objects.requireNonNull(precio);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(adquirido);
        appendChange(new VideojuegoModificado(precio,descripcion,adquirido)).apply();
    }

    public void adquirirVideojuego(Adquirido adquirido){
        Objects.requireNonNull(adquirido);
        appendChange(new VideojuegoAdquirido(adquirido)).apply();
    }


    public Empresa empresa() {
        return desarrollador;
    }

    public Estadisticas rstadisticas() {
        return estadisticas;
    }

    public Precio precio() {
        return precio;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Adquirido adquirido() {
        return adquirido;
    }
}
