package com.sofka.implementacionDDD.Tienda.VideoJuego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalVentas implements ValueObject<String> {

    private final String totalVentas;

    public TotalVentas(String totalVentas) {
        this.totalVentas = Objects.requireNonNull(totalVentas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalVentas that = (TotalVentas) o;
        return Objects.equals(totalVentas, that.totalVentas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalVentas);
    }

    @Override
    public String value() {
        return null;
    }
}