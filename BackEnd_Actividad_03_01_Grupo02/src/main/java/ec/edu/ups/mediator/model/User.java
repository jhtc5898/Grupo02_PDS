package ec.edu.ups.mediator.model;

public class User implements IUserChat {
    private String name;
    private SalonChatImpl salon;

    public User(SalonChatImpl salon) {
        this.salon = salon;
    }

    @Override
    public void send(String to, String message) {
        salon.envia(name, to, message);
    }

    @Override
    public void receive(String from, String message) {
        String s = "El usuario " + from + " te dice: " + message;
        System.out.println(name + ": " + s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SalonChatImpl getSalon() {
        return salon;
    }

    public void setSalon(SalonChatImpl salon) {
        this.salon = salon;
    }
}
