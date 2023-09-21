package ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.service;

import java.util.List;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.model.Vehiculo;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.model.VehiculoDTO;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.model.VehiculoFactory;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.repository.Escenario1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Escenario1Service {

    @Autowired
    VehiculoFactory vehiculoFactory;

    @Autowired
    Escenario1Repository escenario1Repository;

    public Vehiculo addVehiculo(VehiculoDTO vehiculoDTO) {
        var vehiculo = vehiculoFactory.crearVehiculoFactory(vehiculoDTO);
        vehiculo.setPrecioMatricula(vehiculo.calcularCostoMatricula());
        escenario1Repository.addVehiculo(vehiculo);
        return vehiculo;
    }

    public List<Vehiculo> listarVehiculos() {
        return escenario1Repository.listarVehiculos();
    }

}
