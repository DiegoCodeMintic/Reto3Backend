package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Client")
public class ClientWeb {
    @Autowired
    private RepositorioClient servicios;

    @GetMapping("/all")
    public List<Client> getClient(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Client> getDoctor(@PathVariable("id") int id){
        return servicios.getClient(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public  Client save (@RequestBody Client doctor){
        return  servicios.save(doctor);
    }


}
