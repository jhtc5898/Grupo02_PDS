package com.grupo02.grupo02.escenario01.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Carpeta extends Component {

    private List<Component> carpetaList = new ArrayList<>();

    public Carpeta(String nombre, BigDecimal tamanio, String ubicacion) {
        super(nombre, tamanio, ubicacion);
    }

    @Override
    public BigDecimal calcularTamanio() {
        BigDecimal retorno= BigDecimal.ZERO;
        for (var component: this.carpetaList){
            retorno = retorno.add(component.getTamanio());
        }
        return retorno;
    }


    public void add(Component component){
        this.carpetaList.add(component);
    }

    public void delete(Component component){
        this.carpetaList.remove(component);
    }

    public List<Component> getArchivos() {
        return carpetaList;
    }
}
