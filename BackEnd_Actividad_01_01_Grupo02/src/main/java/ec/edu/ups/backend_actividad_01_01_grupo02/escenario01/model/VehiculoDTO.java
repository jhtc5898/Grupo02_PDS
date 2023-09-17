package ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.model;

public class VehiculoDTO {
    private String placa;
    private String color;
    private int anio;
    private String marca;
    private String modelo;

    private String tipo;
    private double precioMatricula;

    public VehiculoDTO() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioMatricula() {
        return precioMatricula;
    }

    public void setPrecioMatricula(double precioMatricula) {
        this.precioMatricula = precioMatricula;
    }
}
