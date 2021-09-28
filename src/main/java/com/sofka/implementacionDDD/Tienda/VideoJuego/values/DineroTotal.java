package com.sofka.implementacionDDD.Tienda.VideoJuego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DineroTotal implements ValueObject<String> {

    private final String dineroTotal;

    public DineroTotal(String dineroTotal) {
        this.dineroTotal = Objects.requireNonNull(dineroTotal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DineroTotal that = (DineroTotal) o;
        return Objects.equals(dineroTotal, that.dineroTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dineroTotal);
    }

    @Override
    public String value() {
        return null;
    }
}