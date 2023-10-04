package ec.edu.ups.mediator.model;

public interface IChatRoom {
    void registerUser(UserImpl userImpl);
    void sendMessage(String from, String to, String message);
}
