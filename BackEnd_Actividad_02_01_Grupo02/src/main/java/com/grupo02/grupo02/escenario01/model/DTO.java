package com.grupo02.grupo02.escenario01.model;

import java.math.BigDecimal;

public class DTO {
    private String nombre;
    private BigDecimal tamanio;
    private String ubicación;

    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getTamanio() {
        return tamanio;
    }

    public void setTamanio(BigDecimal tamanio) {
        this.tamanio = tamanio;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "nombre='" + nombre + '\'' +
                ", tamanio=" + tamanio +
                ", ubicación='" + ubicación + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
