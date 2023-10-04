package ec.edu.ups.mediator.service;

import ec.edu.ups.mediator.model.UserImpl;
import ec.edu.ups.mediator.repository.MediatorRepository;
import ec.edu.ups.mediator.repository.StorageSingleton;
import ec.edu.ups.mediator.model.dto.MediatorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MediatorService {

    @Autowired
    MediatorRepository mediatorRepository;

    public void addMessageChat(MediatorDTO mediatorDTO) {

        UserImpl userImplFrom =new UserImpl(mediatorRepository.getChatRoom());
        userImplFrom.setName(mediatorDTO.getUserNameFrom());
        mediatorRepository.getChatRoom().registerUser(userImplFrom);

        UserImpl userImplTo =new UserImpl(mediatorRepository.getChatRoom());
        userImplTo.setName(mediatorDTO.getUserNameTo());
        mediatorRepository.getChatRoom().registerUser(userImplTo);

        userImplFrom.sendMessage(mediatorDTO.getUserNameTo(), mediatorDTO.getMessage());
    }

    public List<String> getChatList(){
        StorageSingleton storageSingleton=StorageSingleton.getInstance();
        return storageSingleton.getChatList();
    }

}
