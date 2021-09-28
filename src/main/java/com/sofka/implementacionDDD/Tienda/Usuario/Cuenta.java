package com.sofka.implementacionDDD.Tienda.Usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionDDD.Tienda.Compra.values.Correo;
import com.sofka.implementacionDDD.Tienda.Usuario.values.Clave;
import com.sofka.implementacionDDD.Tienda.Usuario.values.IdCuenta;
import com.sofka.implementacionDDD.Tienda.genericvalues.Nombre;

import java.util.Objects;

public class Cuenta extends AggregateEvent<IdCuenta> {
    protected Clave clave;
    protected Correo correo;
    protected Nombre nombre;

    public Cuenta(IdCuenta entityId, Clave clave, Correo correo, Nombre nombre) {
        super(entityId);
        this.clave = clave;
        this.correo = correo;
        this.nombre = nombre;
    }

    public void cambiarClaveUsuario(Clave clave){
        this.clave = Objects.requireNonNull(clave);
    }

    public void cambiarCorreoUsuario(Correo correo){
        this.correo = Objects.requireNonNull(correo);
    }

    public void cambiarNombreUsuario(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Clave clave(){
        return clave;
    }

    public Correo correo(){
        return correo;
    }

    public Nombre nombre(){
        return nombre;
    }
}