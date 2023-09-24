package com.grupo02.grupo02.escenario01.controller;

import com.grupo02.grupo02.escenario01.model.*;
import com.grupo02.grupo02.escenario01.service.Escenario1Service;
import org.apache.catalina.valves.rewrite.InternalRewriteMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/escenario01")
@CrossOrigin
public class Escenario1Controller {
    Carpeta carpeta = null;
    @GetMapping("/ListarArchivos")
    public Carpeta ListarArchivos() {
        return carpeta;
    }

    @PostMapping("/AgregarComponente")
    public void AgregarComponente(@RequestBody DTO dto) {
        System.out.println(dto.toString());
        switch (dto.getTipo().toUpperCase()){
            case "CARPETA":
                carpeta = new Carpeta(dto.getNombre(),dto.getTamanio(),dto.getUbicación());
                break;
            case "DOCX":
                carpeta.add(new Docx(dto.getNombre(),dto.getTamanio(),dto.getUbicación()));
                break;
            case "PDF":
                carpeta.add(new Pdf(dto.getNombre(),dto.getTamanio(),dto.getUbicación()));
                break;
            case "XLSX":
                carpeta.add(new Xlsx(dto.getNombre(),dto.getTamanio(),dto.getUbicación()));
                break;
        }
    }
}
