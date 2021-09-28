package com.sofka.implementacionDDD.Tienda.VideoJuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.entity.Empresa;
import com.sofka.implementacionDDD.Tienda.VideoJuego.entity.Estadisticas;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.Adquirido;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.Descripcion;
import com.sofka.implementacionDDD.Tienda.genericvalues.Precio;

public class VideojuegoCreado extends DomainEvent {


    private final Empresa empresa;
    private final Estadisticas estadisticas;
    private final Precio precio;
    private final Descripcion descripcion;
    private final Adquirido adquirido;

    public VideojuegoCreado( Empresa empresa, Estadisticas estadisticas, Precio precio, Descripcion descripcion, Adquirido adquirido) {
        super("tienda.videojuego.videojuegocreado");
        this.empresa = empresa;
        this.estadisticas = estadisticas;
        this.precio = precio;
        this.descripcion = descripcion;
        this.adquirido = adquirido;
    }


    public Empresa getEmpresa() {
        return empresa;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Adquirido getAdquirido() {
        return adquirido;
    }
}
