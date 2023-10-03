package ec.edu.ups.interpreter.model;

public class ExpresionUnidad extends Expresion{
    @Override
    public String Unidad() {
        return "I";
    }

    @Override
    public String Cuatro() {
        return "IV";
    }

    @Override
    public String Cinco() {
        return "V";
    }

    @Override
    public String Nueve() {
        return "IX";
    }

    @Override
    public int Factor() {
        //El valor encontrado sera multiplicado por 1 en el interprete
        return 1;
    }
}
