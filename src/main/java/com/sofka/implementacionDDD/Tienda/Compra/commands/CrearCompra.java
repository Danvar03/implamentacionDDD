package com.sofka.implementacionDDD.Tienda.Compra.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.Compra.entity.Descuento;
import com.sofka.implementacionDDD.Tienda.Compra.entity.Factura;
import com.sofka.implementacionDDD.Tienda.Compra.values.IdCompra;
import com.sofka.implementacionDDD.Tienda.Compra.values.PrecioTotal;
import com.sofka.implementacionDDD.Tienda.Usuario.Usuario;
import com.sofka.implementacionDDD.Tienda.VideoJuego.Videojuego;

import java.util.List;

public class CrearCompra  implements Command {
    private final IdCompra idCompra;
    private final Usuario usuario;
    private final List<Videojuego> videojuegos;
    private final Factura factura;
    private final Descuento descuento;
    private final PrecioTotal precioTotal;

    public CrearCompra(IdCompra idCompra, Usuario usuario, List<Videojuego> videojuegos, Factura factura, Descuento descuento, PrecioTotal precioTotal) {
        this.idCompra = idCompra;
        this.usuario = usuario;
        this.videojuegos = videojuegos;
        this.factura = factura;
        this.descuento = descuento;
        this.precioTotal = precioTotal;
    }

    public IdCompra getIdCompra() {
        return idCompra;
    }
}
