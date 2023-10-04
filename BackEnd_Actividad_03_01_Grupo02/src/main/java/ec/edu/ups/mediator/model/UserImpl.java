package ec.edu.ups.mediator.model;

import ec.edu.ups.mediator.repository.StorageSingleton;

public class UserImpl implements IUser {
    private String name;
    private ChatRoomImpl chatRoom;

    public UserImpl(ChatRoomImpl chatRoom) {
        this.chatRoom = chatRoom;
    }

    @Override
    public void sendMessage(String to, String message) {
        chatRoom.sendMessage(name, to, message);
    }

    @Override
    public void receiveMessage(String from, String message) {
        StorageSingleton storageSingleton=StorageSingleton.getInstance();

        String chat =name + " -> " + from + " te dice: " + message;
        storageSingleton.getChatList().add(chat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
