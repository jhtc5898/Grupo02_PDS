package ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.controller;

import ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.model.Vehiculo;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.model.VehiculoDTO;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.service.Escenario1Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escenario01")
@CrossOrigin
public class Escenario1Controller {

    @Autowired
    Escenario1Service escenario1Service;

    @PostMapping("/addVehiculo")
    public Vehiculo agregarVehiculo(@RequestBody VehiculoDTO vehiculoDTO) {
        return escenario1Service.addVehiculo(vehiculoDTO);
    }

    @GetMapping("/listVehiculos")
    public List<Vehiculo> listarVehiculos() {
        return escenario1Service.listarVehiculos();
    }


}
