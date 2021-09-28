package com.sofka.implementacionDDD.Tienda.Compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Compra.entity.Descuento;
import com.sofka.implementacionDDD.Tienda.Compra.entity.Factura;
import com.sofka.implementacionDDD.Tienda.Compra.values.PrecioTotal;
import com.sofka.implementacionDDD.Tienda.Usuario.entity.Usuario;
import com.sofka.implementacionDDD.Tienda.VideoJuego.entity.Videojuego;

import java.util.List;

public class CompraCreada extends DomainEvent {
    private final Usuario usuario;
    private final List<Videojuego> videojuegos;
    private final Factura factura;
    private final Descuento descuento;
    private final PrecioTotal precioTotal;

    public CompraCreada(Usuario usuario, List<Videojuego> videojuegos, Factura factura, Descuento descuento, PrecioTotal precioTotal) {
        super("tienda.compra.compracreada");
        this.usuario = usuario;
        this.videojuegos = videojuegos;
        this.factura = factura;
        this.descuento = descuento;
        this.precioTotal = precioTotal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public Factura getFactura() {
        return factura;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public PrecioTotal getPrecioTotal() {
        return precioTotal;
    }
}




