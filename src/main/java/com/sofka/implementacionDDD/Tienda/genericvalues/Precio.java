package com.sofka.implementacionDDD.Tienda.genericvalues;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Float> {

    private final float precio;

    public Precio(float precio) {
        if(precio< 0){
            throw new IllegalArgumentException("El precio total no puede ser negativo");
        }
        if(precio> 99999999){
            throw new IllegalArgumentException("El precio total no puede ser mayor a 99999999");
        }
        this.precio = Objects.requireNonNull(precio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precio that = (Precio) o;
        return Float.compare(that.precio, precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio);
    }

    @Override
    public Float value() {
        return null;
    }
}
