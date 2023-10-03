package ec.edu.ups.interpreter.controller;

import ec.edu.ups.interpreter.service.InterpreterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interpreter")
@CrossOrigin
public class InterpreterController {
    @Autowired
    InterpreterService interpreterService;

    @GetMapping("/evaluar")
    public String evaluarCadena(@RequestParam String expresionEvaluar){
        return interpreterService.evaluar(expresionEvaluar);
    }
}
