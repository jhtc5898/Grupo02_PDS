package ec.edu.ups.backend_actividad_01_01_grupo02.escenario01.model;

import org.springframework.stereotype.Component;

@Component
public class VehiculoFactory extends VehiculoAbstractFactory {
    @Override
    public Vehiculo crearVehiculoFactory(VehiculoDTO vehiculoDTO) {

        switch (vehiculoDTO.getTipo()) {
            case "AUTO":
                return new VehiculoAuto().setData(vehiculoDTO);
            case "CAMIONETA":
                return new VehiculoCamioneta().setData(vehiculoDTO);
            case "CAMION":
                return new VehiculoCamion().setData(vehiculoDTO);
            default:
                throw new IllegalArgumentException("Parámetro inválido");
        }
    }


}
