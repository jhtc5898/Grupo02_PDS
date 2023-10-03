package ec.edu.ups.mediator.model;

import java.util.HashMap;

public class SalonChatImpl implements ISalonChat {
    private HashMap<String, User> participantes = new HashMap<>();

    @Override
    public void registrar(User user) {
        participantes.put(user.getName(), user);
    }

    @Override
    public void envia(String from, String to, String message) {
        if (participantes.containsKey(from) && participantes.containsKey(to)) {
            User user = participantes.get(to);
            user.receive(from, message);
        }else {
            System.out.println("USUARIO EXISTENTE");
        }
    }
}
