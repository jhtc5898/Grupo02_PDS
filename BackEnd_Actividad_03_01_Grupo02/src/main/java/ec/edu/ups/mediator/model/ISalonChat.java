package ec.edu.ups.mediator.model;

public interface ISalonChat {
    void registrar(User user);
    void envia(String from, String to, String message);
}
