package com.grupo02.grupo02.escenario01.model;

import java.math.BigDecimal;

public class Xlsx extends Component{
    public Xlsx(String nombre, BigDecimal tamanio, String ubicacion, String tipo) {
        super(nombre, tamanio, ubicacion, tipo);
    }
    @Override
    public BigDecimal calcularTamanio() {
        return this.getTamanio();
    }
}
