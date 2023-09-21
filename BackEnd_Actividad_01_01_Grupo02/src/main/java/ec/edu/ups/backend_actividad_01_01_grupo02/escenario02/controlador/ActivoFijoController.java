package ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.controlador;


import java.util.List;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.model.ActivoFijo;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.servicio.ActivoFijoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activofijo")
@CrossOrigin
public class ActivoFijoController {

    @Autowired
    ActivoFijoService activoFijoService;

    @GetMapping("getactivofijo")
    @ResponseBody
    public List<ActivoFijo> getactivofijo(){
        return activoFijoService.getactivofijo();
    }

}
