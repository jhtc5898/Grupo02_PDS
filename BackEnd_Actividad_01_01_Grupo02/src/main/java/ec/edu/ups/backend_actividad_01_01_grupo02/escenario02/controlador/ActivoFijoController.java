package ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.controlador;

import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.model.ActivoFijo;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.servicio.ActivoFijoBuilder;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activofijo")
@CrossOrigin
public class ActivoFijoController {

    List<ActivoFijo> activoFijoBuilders = new ArrayList<>();
    @PostConstruct
    public void init(){

        var buil = new ActivoFijoBuilder();
        activoFijoBuilders.add(buil.conColor("azul").conNombre("Chevrolet").conPrecio(1.235).build());
        activoFijoBuilders.add(buil.conColor("azul").conNombre("Chevrolet").conPrecio(1.235).build());
        activoFijoBuilders.add(buil.conColor("azul").conNombre("Chevrolet").conPrecio(1.235).build());

    }


    @GetMapping("getactivofijo")
    @ResponseBody
    public List<ActivoFijo>  getactivofijo(){
        return activoFijoBuilders;
    }

}
