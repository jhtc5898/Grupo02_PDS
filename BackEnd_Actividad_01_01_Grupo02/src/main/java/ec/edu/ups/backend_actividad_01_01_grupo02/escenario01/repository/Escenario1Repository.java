package ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.repository;

import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.model.Vehiculo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Escenario1Repository {

    private List<Vehiculo> vehiculoList = new ArrayList<>();

    public void addVehiculo(Vehiculo vehiculo) {
        try {
            this.vehiculoList.add(vehiculo);
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    public List<Vehiculo> listarVehiculos() {
        return this.vehiculoList;
    }


}
