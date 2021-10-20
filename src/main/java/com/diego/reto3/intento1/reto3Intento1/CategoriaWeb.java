package com.diego.reto3.intento1.reto3Intento1;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DiegoDevelop
 */
@RestController
@RequestMapping("/api/Category")
public class CategoriaWeb {

    @CrossOrigin(origins = "*")
    @GetMapping("/holaMundo")
    public String saludar(){
        return "Hola Mundo  from server diego R";
    }
    
     @Autowired(required = true)
     private RepositorioCategoria servicios;
    @GetMapping("/all")
    public List <Categoria> getCategoria(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Categoria> getCategoria(@PathVariable("id") int idCategoria) {
        return servicios.getCategoria(idCategoria);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria save(@RequestBody Categoria categoria) {
        return servicios.save(categoria);
    } 

}
