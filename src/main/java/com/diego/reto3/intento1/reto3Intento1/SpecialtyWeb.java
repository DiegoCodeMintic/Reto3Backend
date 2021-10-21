package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Specialty")
public class SpecialtyWeb {

    @Autowired(required = true)
    private RepositorioSpecialty servicios;
    @GetMapping("/all")
    public List<Specialty> getSpecialty(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Specialty> getSpecialty(@PathVariable("id") int idSpecialty) {
        return servicios.getSpecialty(idSpecialty);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Specialty save(@RequestBody Specialty specialty) {
        return servicios.save(specialty);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Specialty update (@RequestBody Specialty specialty) {
        return servicios.save(specialty);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delCategori(@PathVariable("id") int idSpecialty){
        Specialty specialty = new Specialty();
        specialty.setId(idSpecialty);
        return servicios.delete(specialty);
    }


}
