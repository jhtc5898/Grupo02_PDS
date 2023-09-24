package com.grupo02.grupo02.escenario02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/escenario02")
//@CrossOrigin
public class Escenario2Controller {

    //@Autowired
    //Escenario1Service escenario1Service;

    @GetMapping("/prueba")
    public String prueba() {
        return "ok";
    }
}
