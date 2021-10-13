package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioGames {
    @Autowired
    private interfaceGame crud;

    public List<Games> getAll(){
        return (List<Games>) crud.findAll();
    }
    public Optional<Games> getGame(int id){
        return  crud.findById(id);
    }
    public  Games save(Games game){
        return  crud.save(game);

    }
}
