package com.sofka.implementacionDDD.Tienda.Compra.values;
import co.com.sofka.domain.generic.Identity;

public class IdDescuento extends Identity {
    public IdDescuento(String uuid) {
        super(uuid);
    }

    public IdDescuento() {
    }

    public static IdDescuento of(String id){
        return new IdDescuento(id);
    }
}