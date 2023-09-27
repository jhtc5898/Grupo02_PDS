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
        double temperatura = 0;
        if(temperaturaDTO.getTipo().equalsIgnoreCase("F")){
            temperatura = new AdapterFanhrenheit().temperatura(temperaturaDTO.getTemperatura());
        }
        if(temperaturaDTO.getTipo().equalsIgnoreCase("C")){
            temperatura = new AdapterCelsius().temperatura(temperaturaDTO.getTemperatura());
        }
        temperaturaDTO.setTemperatura(temperatura);
        escenario2Repository.add(temperaturaDTO);
        return temperatura;
    }
    public List<TemperaturaDTO> registroList(){
        return escenario2Repository.getAll();
    }
}

