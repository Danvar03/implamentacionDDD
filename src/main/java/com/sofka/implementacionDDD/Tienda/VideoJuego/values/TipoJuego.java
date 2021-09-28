package com.sofka.implementacionDDD.Tienda.VideoJuego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoJuego implements ValueObject<String> {
    private final String tipoJuego;

    public TipoJuego(String tipoJuego) {
        this.tipoJuego = Objects.requireNonNull(tipoJuego);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoJuego that = (TipoJuego) o;
        return Objects.equals(tipoJuego, that.tipoJuego);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoJuego);
    }

    @Override
    public String value() {
        return null;
    }
}