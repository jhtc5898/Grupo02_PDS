package ec.edu.ups.mediator.model;

public class User implements IUserChat {
    private String name;
    @Override
    public void send(String to, String message) {

    }

    @Override
    public void receive(String from, String message) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
