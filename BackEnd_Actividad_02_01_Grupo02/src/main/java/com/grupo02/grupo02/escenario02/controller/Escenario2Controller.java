package com.grupo02.grupo02.escenario02.controller;

import com.grupo02.grupo02.escenario02.model.TemperaturaDTO;
import com.grupo02.grupo02.escenario02.repository.Escenario2Repository;
import com.grupo02.grupo02.escenario02.service.Escenario2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escenario02")
@CrossOrigin
public class Escenario2Controller {

    @Autowired
    Escenario2Service escenario2Service;

    @Autowired
    Escenario2Repository escenario2Repository;

    @PostMapping("/temperatura")
    public double temperatura(@RequestBody TemperaturaDTO temperaturaDTO) {
        return escenario2Service.guardarTemperatura(temperaturaDTO);
    }

    @GetMapping("/listar")
    public List<TemperaturaDTO> registroList(){
        return escenario2Service.registroList();
    }
}
