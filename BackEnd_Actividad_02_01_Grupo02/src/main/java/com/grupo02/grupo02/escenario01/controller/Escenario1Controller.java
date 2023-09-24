package com.grupo02.grupo02.escenario01.controller;

import com.grupo02.grupo02.escenario01.service.Escenario1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/escenario01")
@CrossOrigin
public class Escenario1Controller {
   // @Autowired
   // Escenario1Service escenario1Service;

    @GetMapping("/prueba")
    public String prueba(){
        return "ok";
    }
}
