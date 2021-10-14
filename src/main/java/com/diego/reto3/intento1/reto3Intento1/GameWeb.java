package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Game")
public class GameWeb {

    @GetMapping("/holaMundo")
    public String saludar(){
        return "Hola Mundo Colombia from server diego R";
    }

    @Autowired(required = true)
    private   RepositorioGames servicios;
    @GetMapping("/all")
    public List<Games> getGame(){
        return  servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Games> getDoctor(@PathVariable("id") int id){
        return servicios.getGame(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Games save(@RequestBody Games game){
        return servicios.save(game);
    }
}
