package com.sofka.implementacionDDD.Tienda.Compra.entity;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.Compra.events.*;
import com.sofka.implementacionDDD.Tienda.Compra.values.*;
import com.sofka.implementacionDDD.Tienda.Usuario.entity.Usuario;
import com.sofka.implementacionDDD.Tienda.VideoJuego.entity.Videojuego;

import java.util.List;
import java.util.Objects;


public class Compra extends AggregateEvent<IdCompra> {
    protected Usuario usuario;
    protected List<Videojuego> videojuegos;
    protected Factura factura;
    protected Descuento descuento;
    protected PrecioTotal precioTotal;

    public Compra(IdCompra entityId, Usuario usuario, List<Videojuego> videojuegos, Factura factura, Descuento descuento, PrecioTotal precioTotal) {
        super(entityId);
        appendChange(new CompraCreada(usuario,videojuegos,factura,descuento, precioTotal)).apply();
    }

    public Compra(IdCompra idCompra){
        super(idCompra);
        subscribe(new CompraChange(this));
    }

    public static Compra from(IdCompra idCompra, List<DomainEvent> events){
        var compra = new Compra(idCompra);
        events.forEach(compra::applyEvent);
        return compra;
    }

    public void aplicarDescuento(Fecha fechaLimite, Porcentaje porcentaje){
        Objects.requireNonNull(fechaLimite);
        Objects.requireNonNull(porcentaje);
        appendChange(new DescuentoAplicado(fechaLimite,porcentaje)).apply();
    }

    public void asociarFactura(PrecioTotal precioTotal, NumeroVideojuegos numeroVideojuegos, Fecha fecha){
        Objects.requireNonNull(precioTotal);
        Objects.requireNonNull(numeroVideojuegos);
        Objects.requireNonNull(fecha);
        appendChange(new FacturaAsociada(precioTotal,numeroVideojuegos,fecha)).apply();
    }

    public void modificarFactura(Factura factura){
        Objects.requireNonNull(factura);
        appendChange(new FacturaModificada(factura)).apply();;
    }

    public void modificarDescuento(Descuento descuento){
        Objects.requireNonNull(descuento);
        appendChange(new DescuentoModificado(descuento)).apply();
    }

    public void agregarVideojuegoCompra(Videojuego videojuego){
        Objects.requireNonNull(videojuego);
        appendChange(new VideojuegoAgregadoCompra(videojuego)).apply();
    }


    public Usuario usuario() {
        return usuario;
    }

    public List<Videojuego> videojuegos() {
        return videojuegos;
    }

    public Factura factura() {
        return factura;
    }

    public Descuento descuento() {
        return descuento;
    }

    public PrecioTotal precioTotal() {
        return precioTotal;
    }
}