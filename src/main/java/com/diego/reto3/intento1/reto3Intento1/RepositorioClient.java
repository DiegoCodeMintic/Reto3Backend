package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioClient {
    @Autowired
    private interfaceClient crud;
    public List<Client> getAll(){
        return (List<Client>) crud.findAll();
    }
    public Optional<Client> getClient(int id){
        return crud.findById(id);
    }
    public Client save(Client client ){
        return crud.save(client);
    }
}
