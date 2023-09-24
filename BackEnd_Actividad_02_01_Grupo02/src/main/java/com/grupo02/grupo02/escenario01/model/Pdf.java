package com.grupo02.grupo02.escenario01.model;

import java.math.BigDecimal;

public class Pdf extends Component{

    public Pdf(String nombre, BigDecimal tamanio, String ubicacion) {
        super(nombre, tamanio, ubicacion);
    }

    @Override
    public BigDecimal calcularTamanio() {
        return this.getTamanio();
    }


}
