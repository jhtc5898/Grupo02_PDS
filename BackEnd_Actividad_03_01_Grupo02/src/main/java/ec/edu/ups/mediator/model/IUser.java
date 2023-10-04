package ec.edu.ups.mediator.model;

public interface IUser {
    void receiveMessage(String from, String message);
    void sendMessage(String to, String message);

}
