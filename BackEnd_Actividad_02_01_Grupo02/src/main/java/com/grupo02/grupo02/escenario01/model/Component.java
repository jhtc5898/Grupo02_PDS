package com.grupo02.grupo02.escenario01.model;

import java.math.BigDecimal;

public abstract class Component {

    private String nombre;
    private BigDecimal tamanio;
    private String ubicación;



    public Component(String nombre, BigDecimal tamanio, String ubicación) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.ubicación = ubicación;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getTamanio() {
        return tamanio;
    }

    public abstract BigDecimal calcularTamanio();

    public String getUbicación() {
        return ubicación;
    }
}
