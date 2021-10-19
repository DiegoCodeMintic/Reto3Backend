package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.DoubleConsumer;

@RestController
@RequestMapping("/api/Doctor")
public class DoctorWeb {
    @Autowired
    private RepositorioDoctor servicios;
    @CrossOrigin(origins = "*")
    @GetMapping("/all")
    public List<Doctor> getDoctor(){
        return servicios.getAll();
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<Doctor> getDoctor(@PathVariable("id") int idDoctor){
        return servicios.getDoctor(idDoctor);
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public  Doctor save (@RequestBody Doctor doctor){
        return  servicios.save(doctor);
    }
}
