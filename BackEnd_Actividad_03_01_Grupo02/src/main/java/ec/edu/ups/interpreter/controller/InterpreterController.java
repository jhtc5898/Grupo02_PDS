package ec.edu.ups.interpreter.controller;

import ec.edu.ups.interpreter.service.InterpreterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interpreter")
@CrossOrigin
public class InterpreterController {
    @Autowired
    InterpreterService interpreterService;

    @GetMapping("/evaluarFecha")
    public String evaluarFecha(@RequestParam String expresionEvaluar) {
        return "{\"data\":\"" +interpreterService.evaluar(expresionEvaluar)+ "\"}";
    }

    @GetMapping("/evaluarGeneral")
    public Integer evaluarGeneral(@RequestParam String expresionEvaluar){
        return interpreterService.interpreter(expresionEvaluar);
    }
}
