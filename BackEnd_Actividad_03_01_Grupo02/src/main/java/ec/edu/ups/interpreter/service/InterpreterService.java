package ec.edu.ups.interpreter.service;

import ec.edu.ups.interpreter.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InterpreterService {

    public Integer evaluar(String expresionEvaluar){
        //String expresionEvaluar = "MCMXCIV";
        Contexto contexto = new Contexto(expresionEvaluar);

        //Se construye el arbol de parse cada clase corresponde a una regla gramatical
        List<Expresion> arbol = new ArrayList<>();
        arbol.add(new ExpresionMiles());
        arbol.add(new ExpresionCientos());
        arbol.add(new ExpresionDecenas());
        arbol.add(new ExpresionDecenas());
        arbol.add(new ExpresionUnidad());

        //Interpretamos siguiendo las reglas gramaticales que estan en el arbol
        for (Expresion exp: arbol) {
            exp.Interpretar(contexto);
        }

        return contexto.getValor();
    }
}
