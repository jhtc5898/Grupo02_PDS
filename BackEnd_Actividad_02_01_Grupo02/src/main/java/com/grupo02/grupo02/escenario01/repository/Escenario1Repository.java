package com.grupo02.grupo02.escenario01.repository;

import com.grupo02.grupo02.escenario01.model.Carpeta;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Scope("singleton")
public class Escenario1Repository {
    Carpeta carpeta = new Carpeta("ROOT",new BigDecimal(0.0),"/","CARPETA");

    public void saveComponent(com.grupo02.grupo02.escenario01.model.Component component){
        carpeta.add(component);
    }

    public Carpeta getComponent(){
        return this.carpeta;
    }

}
