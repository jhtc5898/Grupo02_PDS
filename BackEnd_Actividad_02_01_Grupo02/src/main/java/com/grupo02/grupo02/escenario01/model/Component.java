package com.grupo02.grupo02.escenario01.model;

import java.math.BigDecimal;

public abstract class Component {

    private String nombre;
    private BigDecimal tamanio;
    private String ubicacion;

    private String Tipo;


    public Component(String nombre, BigDecimal tamanio, String ubicacion, String tipo) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.ubicacion = ubicacion;
        this.Tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getTamanio() {
        return tamanio;
    }

    public abstract BigDecimal calcularTamanio();

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipo() {
        return Tipo;
    }
}
