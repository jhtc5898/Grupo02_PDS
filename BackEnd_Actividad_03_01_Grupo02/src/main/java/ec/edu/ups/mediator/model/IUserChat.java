package ec.edu.ups.mediator.model;

public interface IUserChat {
    void send(String to, String message);

    void receive(String from, String message);
}
