package ec.edu.ups.mediator.repository;

import ec.edu.ups.mediator.model.ChatRoomImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MediatorRepository {
    ChatRoomImpl chatRoom =new ChatRoomImpl();

    public ChatRoomImpl getChatRoom() {
        return chatRoom;
    }



}
