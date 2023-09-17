package ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.model;

import java.time.LocalDate;

public class ActivoFijo {
    private String codigo;
    private String nombre;
    private Double precio;
    private String color;
    private String dimensiones;
    private Double peso;
    private String modelo;
    private LocalDate FechaCreacion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "ActivoFijo{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", dimensiones='" + dimensiones + '\'' +
                ", peso=" + peso +
                ", modelo='" + modelo + '\'' +
                ", FechaCreacion=" + FechaCreacion +
                '}';
    }
}
