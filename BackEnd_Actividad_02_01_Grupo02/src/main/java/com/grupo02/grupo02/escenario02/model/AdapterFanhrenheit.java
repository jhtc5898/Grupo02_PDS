package com.grupo02.grupo02.escenario02.model;

public class AdapterFanhrenheit implements ITemperatura {
    private TemperaturaFahrenheit temperaturaFahrenheit = new TemperaturaFahrenheit();

    @Override
    public double temperatura(double temperatura) {
        return temperaturaFahrenheit.obtieneTemperatura(temperatura);
    }
}
