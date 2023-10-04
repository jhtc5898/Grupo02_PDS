package ec.edu.ups.mediator.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StorageSingleton {

    private static StorageSingleton instance;

    private List<String> chatList=new ArrayList<>();

    private StorageSingleton() {
    }

    public static synchronized StorageSingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new StorageSingleton();
        }
        return instance;
    }

    public List<String> getChatList() {
        return chatList;
    }

}