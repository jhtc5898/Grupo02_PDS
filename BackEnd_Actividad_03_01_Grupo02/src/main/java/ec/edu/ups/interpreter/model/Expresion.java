package ec.edu.ups.interpreter.model;

public abstract class Expresion {

    public void Interpretar(Contexto contexto){
        int valor = 0;
        //Si ya no hay elementos que interpretar sale
        if (contexto.getExpresion().length()==0){
            return;
        }
        //Verifica si empieza con nueve
        else if (contexto.getExpresion().startsWith(Nueve())) {
            //Agregamos el nuevo por la posicion donde este 1,10,100
            contexto.setValor(contexto.getValor() + (9 * Factor()));

            //Eliminamos dos caracteres IX, XC, CM
            contexto.setExpresion(contexto.getExpresion().substring(2));
        }
        //Verifica si empieza con cuatro
        else if (contexto.getExpresion().startsWith(Cuatro())) {
            //Agregamos el nuevo por la posicion donde este 1,10,100
            contexto.setValor(contexto.getValor() + (4 * Factor()));

            //Eliminamos dos caracteres
            contexto.setExpresion(contexto.getExpresion().substring(2));
        }
        //Verifica si empieza con cinco
        else if (contexto.getExpresion().startsWith(Cinco())) {
            //Agregamos el nuevo por la posicion donde este 1,10,100
            contexto.setValor(contexto.getValor() + (5 * Factor()));

            //Eliminamos un caracter
            contexto.setExpresion(contexto.getExpresion().substring(1));
        }

        while (contexto.getExpresion().startsWith(Unidad())){
            contexto.setValor(contexto.getValor() + (1 * Factor()));
            contexto.setExpresion(contexto.getExpresion().substring(1));
        }

    }

    //Metodos abstractos para encontrar el caracter y factor segun la posicion
    public abstract String Unidad();
    public abstract String Cuatro();
    public abstract String Cinco();
    public abstract String Nueve();
    public abstract int Factor();
}
