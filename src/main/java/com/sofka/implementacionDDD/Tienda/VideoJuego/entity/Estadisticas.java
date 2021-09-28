package com.sofka.implementacionDDD.Tienda.VideoJuego.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.DineroTotal;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.IdEstadistica;
import com.sofka.implementacionDDD.Tienda.VideoJuego.values.TotalVentas;

import java.util.Objects;

public class Estadisticas extends Entity<IdEstadistica> {

    protected TotalVentas totalVentas;
    protected DineroTotal dineroTotal;

    public Estadisticas(IdEstadistica entityId, TotalVentas totalVentas, DineroTotal dineroTotal) {
        super(entityId);
        this.totalVentas = totalVentas;
        this.dineroTotal = dineroTotal;
    }

    public void actualizarValores(TotalVentas totalVentas, DineroTotal dineroTotal){
        this.totalVentas = Objects.requireNonNull(totalVentas);
        this.dineroTotal = Objects.requireNonNull(dineroTotal);
    }

    public TotalVentas totalVentas(){
        return this.totalVentas;
    }

    public DineroTotal dineroRecaudado(){
        return this.dineroTotal;
    }
}
