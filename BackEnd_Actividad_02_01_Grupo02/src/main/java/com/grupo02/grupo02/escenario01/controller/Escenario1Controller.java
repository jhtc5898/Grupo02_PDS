package com.grupo02.grupo02.escenario01.controller;

import com.grupo02.grupo02.escenario01.model.*;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/escenario01")
@CrossOrigin
public class Escenario1Controller {
    Carpeta carpeta = new Carpeta("ROOT",new BigDecimal(0.0),"/","CARPETA");
    @GetMapping("/ListarArchivos")
    public Carpeta ListarArchivos() {
        return carpeta;
    }

    @PostMapping("/AgregarComponente")
    public void AgregarComponente(@RequestBody DTO dto) {
        System.out.println(dto.toString());
        switch (dto.getTipo().toUpperCase()){
            case "CARPETA":
                carpeta.add(new Carpeta(dto.getNombre(),dto.getTamanio(),dto.getUbicacion(), dto.getTipo()));
                break;
            case "DOCX":
                carpeta.add(new Docx(dto.getNombre(),dto.getTamanio(),dto.getUbicacion(), dto.getTipo()));
                break;
            case "PDF":
                carpeta.add(new Pdf(dto.getNombre(),dto.getTamanio(),dto.getUbicacion(), dto.getTipo()));
                break;
            case "XLSX":
                carpeta.add(new Xlsx(dto.getNombre(),dto.getTamanio(),dto.getUbicacion(), dto.getTipo()));
                break;
        }
    }
}
