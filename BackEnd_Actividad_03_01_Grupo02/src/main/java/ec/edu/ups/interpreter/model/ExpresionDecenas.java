package ec.edu.ups.interpreter.model;

public class ExpresionDecenas extends Expresion{
    @Override
    public String Unidad() {
        return "X";
    }

    @Override
    public String Cuatro() {
        return "XL";
    }

    @Override
    public String Cinco() {
        return "L";
    }

    @Override
    public String Nueve() {
        return "XC";
    }

    @Override
    public int Factor() {
        return 10;
    }
}
