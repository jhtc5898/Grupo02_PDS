package com.grupo02.grupo02.escenario02.repository;

import com.grupo02.grupo02.escenario02.model.TemperaturaDTO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class Escenario2Repository {

    private List<TemperaturaDTO> registroList = new ArrayList<>();

    public void add(TemperaturaDTO temperaturaDTO){
        this.registroList.add(temperaturaDTO);
    }

    public List<TemperaturaDTO> getAll(){
        return this.registroList;
    }

}
