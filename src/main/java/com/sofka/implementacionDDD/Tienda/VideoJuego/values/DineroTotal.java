package com.sofka.implementacionDDD.Tienda.VideoJuego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DineroTotal implements ValueObject<String> {

    private final String dineoTotal;

    public DineroTotal(String dineroTotal) {
        this.dineoTotal = Objects.requireNonNull(dineroTotal);
    }


    @Override
    public int hashCode() {
        return Objects.hash(dineoTotal);
    }

    @Override
    public String value() {
        return null;
    }
}