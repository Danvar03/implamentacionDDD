package com.sofka.implementacionDDD.Tienda.Usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Clave implements ValueObject<String> {

    private final String clave;

    public Clave(String clave) {
        if(clave.length()>20){
            throw new IllegalArgumentException("La clave de usuario no puede superar los 20 caracteres");
        }
        if(clave.length()<8){
            throw new IllegalArgumentException("La clave de usuario no puede ser inferior a los 8 caracteres");
        }
        this.clave = Objects.requireNonNull(clave);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clave that = (Clave) o;
        return Objects.equals(clave, that.clave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clave);
    }

    @Override
    public String value() {
        return null;
    }
}