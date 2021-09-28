package com.sofka.implementacionDDD.Tienda.VideoJuego.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionDDD.Tienda.VideoJuego.entity.Empresa;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.IdVideojuego;

public class ModificarEmpresa implements Command {
    private final IdVideojuego idVideojuego;
    private final Empresa empresa;

    public ModificarEmpresa(IdVideojuego idVideojuego, Empresa empresa) {
        this.idVideojuego = idVideojuego;
        this.empresa = empresa;
    }

    public IdVideojuego getIdVideojuego() {
        return idVideojuego;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}
