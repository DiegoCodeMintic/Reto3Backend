package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioMessage {
    @Autowired
    private interfaceMessage crud;
    public List<Message> getAll(){
        return (List<Message>) crud.findAll();
    }
    public Optional<Message> getMessage(int id){
        return crud.findById(id);
    }
    public Message save(Message message ){
        return crud.save(message);
    }

    public  Message update (Message message){
        return crud.save(message);
    }
    public boolean delete (Message message){
        crud.delete(message);
        return  true;
    }
}
