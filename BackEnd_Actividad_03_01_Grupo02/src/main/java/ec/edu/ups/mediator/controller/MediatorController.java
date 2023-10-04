package ec.edu.ups.mediator.controller;

import ec.edu.ups.mediator.model.dto.MediatorDTO;
import ec.edu.ups.mediator.service.MediatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/mediator")
public class MediatorController {

    @Autowired
    MediatorService mediatorService;

    @PostMapping("/sendmessage")
    public ResponseEntity<String> addMessge(@RequestBody MediatorDTO mediatorDTO) {
        mediatorService.addMessageChat(mediatorDTO);
        return ResponseEntity.ok("Mensaje enviado Exitosamente");
    }

    @GetMapping("/chatlist")
    public List<String> getChatList(){
        return mediatorService.getChatList();
    }


}
