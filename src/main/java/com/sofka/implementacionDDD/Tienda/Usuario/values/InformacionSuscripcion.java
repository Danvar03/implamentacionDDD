package com.sofka.implementacionDDD.Tienda.Usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;
import java.util.Objects;

public class InformacionSuscripcion implements ValueObject<ArrayList<String>> {

    private final ArrayList<String> informacionSuscripcion;

    public InformacionSuscripcion(ArrayList<String> informacionSuscripcion) {
        this.informacionSuscripcion = informacionSuscripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InformacionSuscripcion that = (InformacionSuscripcion) o;
        return Objects.equals(informacionSuscripcion, that.informacionSuscripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(informacionSuscripcion);
    }

    @Override
    public ArrayList<String> value() {
        return null;
    }
}