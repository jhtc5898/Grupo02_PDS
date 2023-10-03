package ec.edu.ups.interpreter.model;

public class Contexto {
    private String expresion;
    private int valor;

    public Contexto(String expresion) {
        this.expresion = expresion;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
