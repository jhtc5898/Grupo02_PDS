package ec.edu.ups.mediator.model;

import java.util.HashMap;

public class ChatRoomImpl implements IChatRoom {
    private HashMap<String, UserImpl> usersMap = new HashMap<>();

    @Override
    public void registerUser(UserImpl userImpl) {
        if(!usersMap.containsKey(userImpl.getName())){
        usersMap.put(userImpl.getName(), userImpl);
        }
    }

    @Override
    public void sendMessage(String from, String to, String message) {
        if (usersMap.containsKey(from) && usersMap.containsKey(to)) {
            UserImpl userImplTo = usersMap.get(to);
            userImplTo.receiveMessage(from, message);
        }else {
            throw new RuntimeException("El usuario emisor o el receptor no se encuentran registrados");
        }
    }
}
