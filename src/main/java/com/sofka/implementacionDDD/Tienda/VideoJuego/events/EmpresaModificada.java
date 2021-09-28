package com.sofka.implementacionDDD.Tienda.VideoJuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionDDD.Tienda.VideoJuego.entity.Empresa;

public class EmpresaModificada extends DomainEvent {

 public final Empresa empresa;

    public EmpresaModificada(String type, Empresa empresa) {
        super("tienda.videojuego.empresamodificado");
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}