package com.sofka.implementacionDDD.Tienda.Compra.entity;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionDDD.Tienda.Compra.values.Fecha;
import com.sofka.implementacionDDD.Tienda.Compra.values.IdDescuento;
import com.sofka.implementacionDDD.Tienda.Compra.values.Porcentaje;

public class Descuento extends AggregateEvent<IdDescuento> {

    protected Fecha fechaLimite;
    protected Porcentaje porcentaje;

    public Descuento(IdDescuento entityId, Fecha fechaLimite, Porcentaje porcentaje) {
        super(entityId);
        this.fechaLimite = fechaLimite;
        this.porcentaje = porcentaje;
    }

    public void modificarPorcentaje(Porcentaje porcentaje){
        this.porcentaje = porcentaje;
    }

    public void modificarFechaLimite(Fecha fechaLimite){
        this.fechaLimite = fechaLimite;
    }

    public Fecha fechaLimite() {
        return fechaLimite;
    }

    public Porcentaje porcentaje() {
        return porcentaje;
    }
}