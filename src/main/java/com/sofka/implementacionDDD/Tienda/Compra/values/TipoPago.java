package com.sofka.implementacionDDD.Tienda.Compra.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoPago implements ValueObject<String> {

    public String value;

    public TipoPago(String value){
        Objects.requireNonNull(value, "Debe de tener un tipo de pago");
        if(value.isBlank()){
            throw new IllegalArgumentException("tipo de membresia no puede estar vacia");
        }
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoPago tipo = (TipoPago) o;
        return Objects.equals(value, tipo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

