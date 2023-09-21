package ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.repositorio;

import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.model.ActivoFijo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Escenario2Repository {

    List<ActivoFijo> listActivoFijo = new ArrayList<>();

    public Boolean saveActivofijo(ActivoFijo activoFijo) {
        return listActivoFijo.add(activoFijo);
    }

    public List<ActivoFijo> listactivofijo() {
        return listActivoFijo;
    }

}
