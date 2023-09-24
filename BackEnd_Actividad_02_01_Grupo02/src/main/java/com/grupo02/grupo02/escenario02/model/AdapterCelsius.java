package com.grupo02.grupo02.escenario02.model;

public class AdapterCelsius implements ITemperatura {
    private TemperaturaCelsius temperaturaCelsius = new TemperaturaCelsius();
    @Override
    public double temperatura(double temperatura) {
        return 0;
    }
}
