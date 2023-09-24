package com.grupo02.grupo02.escenario01.model;

import java.math.BigDecimal;

public class DTO {
    private String nombre;
    private BigDecimal tamanio;
    private String ubicacion;

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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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
                ", ubicacion='" + ubicacion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
