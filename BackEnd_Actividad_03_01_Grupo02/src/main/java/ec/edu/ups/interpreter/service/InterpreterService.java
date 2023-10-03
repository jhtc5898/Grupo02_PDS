package ec.edu.ups.interpreter.service;

import ec.edu.ups.interpreter.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InterpreterService {

    public String evaluar(String expresionEvaluar){

        String[] fechaSeparada =  separarFecha(expresionEvaluar);

        if (fechaSeparada != null && fechaSeparada.length == 3) {
            String dia = String.valueOf(interpreter(fechaSeparada[0]));
            String mes = String.valueOf(interpreter(fechaSeparada[1]));
            String anio = String.valueOf(interpreter(fechaSeparada[2]));

            return dia + "/" + mes + "/" + anio;
        } else {
            return "Formato de fecha incorrecto";
        }
    }

    public Integer interpreter(String data) {

        //String expresionEvaluar = "MCMXCIV";
        Contexto contexto = new Contexto(data);

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

    private static String[] separarFecha(String fecha) {
        if (fecha != null && (fecha.contains("/") || fecha.contains("-"))) {
            // Utilizamos una expresión regular para dividir la fecha por "/" o "-"
            String[] partes = fecha.split("[/-]");
            return partes;
        } else {
            return null;
        }
    }
}
