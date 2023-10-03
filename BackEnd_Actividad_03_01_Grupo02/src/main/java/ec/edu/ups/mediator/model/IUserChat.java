package ec.edu.ups.mediator.model;

public interface IUserChat {
    void receive(String from, String message);
    void send(String to, String message);

}
