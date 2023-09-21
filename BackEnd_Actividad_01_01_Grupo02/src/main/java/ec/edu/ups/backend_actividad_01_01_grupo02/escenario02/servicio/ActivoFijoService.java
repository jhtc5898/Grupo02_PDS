package ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.servicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.backend_actividad_01_01_grupo02.escenario02.model.ActivoFijo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActivoFijoService {

    @Autowired
    ActivoFijoBuilder activoFijoBuilder;

    List<ActivoFijo> listActivoFijo = new ArrayList<>();
    @PostConstruct
    public void init(){

        var buil = new ActivoFijoBuilder();
        listActivoFijo.add(buil
            .conCodigo("1")
            .conNombre("Dmax")
            .conPrecio(10000.00)
            .conColor("azul")
            .conModelo("Camioneta")
            .conFechaCreacion(LocalDate.now().minusYears(2))
            .conURL("https://www.chevrolet.com.ec/content/dam/chevrolet/south-america/ecuador/espanol/index/pickups-and-trucks/2020-dmax-premier/home/05-images/dmax-premier-ajustes/2022-colorizer-d-max-premier-03.jpg?imwidth=960")
            .build());
        var buil2 = new ActivoFijoBuilder();
        listActivoFijo.add(buil2
            .conCodigo("2")
            .conNombre("Asus Vivobook")
            .conPrecio(850.00)
            .conColor("negro")
            .conDimensiones("15pgx16pg")
            .conPeso(2.44)
            .conURL("https://m.media-amazon.com/images/I/81mZ4eDWYkL._AC_UF1000,1000_QL80_.jpg")
            .build());
        var buil3 = new ActivoFijoBuilder();
        listActivoFijo.add(buil3
            .conCodigo("3")
            .conNombre("Mesa")
            .conPrecio(175.00)
            .conColor("Madera")
            .conDimensiones("1.50mx2m")
            .conURL("https://m.media-amazon.com/images/I/71hPaTX4GkL._AC_UF1000,1000_QL80_.jpg")
            .build());
        var buil4 = new ActivoFijoBuilder();
        listActivoFijo.add(buil4
            .conCodigo("4")
            .conNombre("Silla Comedor")
            .conPrecio(45.00)
            .conColor("Negro")
            .conURL("https://m.media-amazon.com/images/I/41zGghiFDaL._AC_UF1000,1000_QL80_.jpg")
            .build());
        var buil5 = new ActivoFijoBuilder();
        listActivoFijo.add(buil5
            .conCodigo("5")
            .conNombre("Impresora")
            .conPrecio(250.00)
            .conModelo("Epson EcoTank")
            .conURL("https://m.media-amazon.com/images/I/81e-sZ4o1aS._AC_UF894,1000_QL80_.jpg")
            .build());
    }

    public List<ActivoFijo> getactivofijo() {
        return listActivoFijo;
    }

}
