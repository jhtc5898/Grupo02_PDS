package com.grupo02.grupo02.escenario01.service;

import com.grupo02.grupo02.escenario01.model.*;
import com.grupo02.grupo02.escenario01.repository.Escenario1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Escenario1Service {

    @Autowired
    Escenario1Repository escenario1Repository;

    public Carpeta getComponents() {
        return escenario1Repository.getComponent();
    }

    public void saveComponent(ComponenteDTO componenteDTO){
        switch (componenteDTO.getTipo().toUpperCase()){
            case "CARPETA":
                escenario1Repository.saveComponent(new Carpeta(componenteDTO.getNombre(), componenteDTO.getTamanio(), componenteDTO.getUbicacion(), componenteDTO.getTipo()));
                break;
            case "DOCX":
                escenario1Repository.saveComponent(new Docx(componenteDTO.getNombre(), componenteDTO.getTamanio(), componenteDTO.getUbicacion(), componenteDTO.getTipo()));
                break;
            case "PDF":
                escenario1Repository.saveComponent(new Pdf(componenteDTO.getNombre(), componenteDTO.getTamanio(), componenteDTO.getUbicacion(), componenteDTO.getTipo()));
                break;
            case "XLSX":
                escenario1Repository.saveComponent(new Xlsx(componenteDTO.getNombre(), componenteDTO.getTamanio(), componenteDTO.getUbicacion(), componenteDTO.getTipo()));
                break;
        }

    }

}
