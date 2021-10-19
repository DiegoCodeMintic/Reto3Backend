package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Message")
public class MessageWeb {
    @Autowired(required = true)
    private   RepositorioMessage servicios;
    @GetMapping("/all")
    public List<Message> getGame(){
        return  servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Message> getDoctor(@PathVariable("id") int id){
        return servicios.getMessage(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public  Message save (@RequestBody Message message){
        return  servicios.save(message);
    }
}
