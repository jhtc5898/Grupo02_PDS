package com.grupo02.grupo02.escenario01.controller;

import com.grupo02.grupo02.escenario01.model.Carpeta;
import com.grupo02.grupo02.escenario01.model.ComponenteDTO;
import com.grupo02.grupo02.escenario01.service.Escenario1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/escenario01")
@CrossOrigin
public class Escenario1Controller {

    @Autowired
    Escenario1Service escenario1Service;

    @GetMapping("/ListarArchivos")
    public Carpeta listarArchivos() {
        return escenario1Service.getComponents();
    }

    @PostMapping("/AgregarComponente")
    public ResponseEntity<String> agregarComponente(@RequestBody ComponenteDTO componenteDTO) {
        escenario1Service.saveComponent(componenteDTO);
        return ResponseEntity.ok("Componente Agregado Exitosamente");
    }

}
