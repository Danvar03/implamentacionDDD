package com.sofka.implementacionDDD.Tienda.VideoJuego.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.Adquirido;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.Descripcion;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.IdVideojuego;
import com.sofka.implementacionDDD.Tienda.genericvalues.Precio;


public class ModificarVideojuego implements Command {
    private final IdVideojuego idVideojuego;
    private final Precio precio;
    private final Descripcion descripcion;
    private final Adquirido adquirido;

    public ModificarVideojuego(IdVideojuego idVideojuego, Precio precio, Descripcion descripcion, Adquirido adquirido) {
        this.idVideojuego = idVideojuego;
        this.precio = precio;
        this.descripcion = descripcion;
        this.adquirido = adquirido;
    }

    public IdVideojuego getIdVideojuego() {
        return idVideojuego;
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
