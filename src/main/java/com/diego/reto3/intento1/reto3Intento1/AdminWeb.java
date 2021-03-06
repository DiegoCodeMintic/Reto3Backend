package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Admin")
public class AdminWeb {
    @Autowired
    private RepositorioAdmin servicios;
    @GetMapping("/all")
    public List<Admin> getAdmin(){
        return servicios.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Admin> getAdmin(@PathVariable("id") int idAdmin){
        return servicios.getAdmin(idAdmin);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public  Admin save (@RequestBody Admin admin){
        return  servicios.save(admin);
    }
}
