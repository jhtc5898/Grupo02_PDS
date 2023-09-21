package ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.servicio;

import ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.model.ActivoFijo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ActivoFijoBuilder {

    private ActivoFijo activoFijo;

    public ActivoFijoBuilder() {
        this.activoFijo = new ActivoFijo();
    }

    public ActivoFijoBuilder conCodigo(String codigo){
        this.activoFijo.setCodigo(codigo);
        return this;
    }

    public ActivoFijoBuilder conNombre(String nombre){
        this.activoFijo.setNombre(nombre);
        return this;
    }

    public ActivoFijoBuilder conPrecio(Double precio){
        this.activoFijo.setPrecio(precio);
        return this;
    }

    public ActivoFijoBuilder conColor(String color){
        this.activoFijo.setColor(color);
        return this;
    }

    public ActivoFijoBuilder conDimensiones(String dimensiones){
        this.activoFijo.setDimensiones(dimensiones);
        return this;
    }

    public ActivoFijoBuilder conPeso(double peso){
        this.activoFijo.setPeso(peso);
        return this;
    }

    public ActivoFijoBuilder conModelo(String modelo){
        this.activoFijo.setModelo(modelo);
        return this;
    }

    public ActivoFijoBuilder conFechaCreacion(LocalDate fechaCreacion){
        this.activoFijo.setFechaCreacion(fechaCreacion);
        return this;
    }

    public ActivoFijoBuilder conURL(String url){
        this.activoFijo.setURL(url);
        return this;
    }

    public ActivoFijo build(){
        return this.activoFijo;
    }
}
