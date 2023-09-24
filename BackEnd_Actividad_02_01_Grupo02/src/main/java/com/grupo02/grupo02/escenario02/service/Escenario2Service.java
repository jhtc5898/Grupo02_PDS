package com.grupo02.grupo02.escenario02.service;

import com.grupo02.grupo02.escenario02.model.AdapterCelsius;
import com.grupo02.grupo02.escenario02.model.AdapterFanhrenheit;
import com.grupo02.grupo02.escenario02.model.TemperaturaDTO;
import com.grupo02.grupo02.escenario02.repository.Escenario2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Escenario2Service {

    @Autowired
    Escenario2Repository escenario2Repository;
    public double guardarTemperatura(TemperaturaDTO temperaturaDTO){
        var registro = new TemperaturaDTO();
        registro.setTemperatura(temperaturaDTO.getTemperatura());
        registro.setEdificio(temperaturaDTO.getEdificio());
        registro.setTipo(temperaturaDTO.getTipo());
        registro.setPiso(temperaturaDTO.getPiso());
        escenario2Repository.add(registro);
        double temp = 0;
        if(temperaturaDTO.getTipo().equalsIgnoreCase("F")){
            temp = new AdapterFanhrenheit().temperatura(temperaturaDTO.getTemperatura());
        }
        if(temperaturaDTO.getTipo().equalsIgnoreCase("C")){
            temp = new AdapterCelsius().temperatura(temperaturaDTO.getTemperatura());
        }
        return temp;
    }

    public List<TemperaturaDTO> registroList(){
        return escenario2Repository.getAll();
    }
}

