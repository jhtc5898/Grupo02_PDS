package ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.controlador;

import ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.servicio.ActivoFijoBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activofijo")
public class ActivoFijoController {
    @GetMapping("getactivofijo")
    public String getactivofijo(){
        var buil = new ActivoFijoBuilder();
        var activoFijo =  buil.conColor("azul").conNombre("Chevrolet").conPrecio(1.235).build();
        return activoFijo.toString();
    }

}
