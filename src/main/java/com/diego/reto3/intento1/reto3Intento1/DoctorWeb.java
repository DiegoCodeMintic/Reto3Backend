package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.DoubleConsumer;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Doctor")
public class DoctorWeb {
    @Autowired
    private RepositorioDoctor servicios;

    @GetMapping("/all")
    public List<Doctor> getDoctor(){
        return servicios.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Doctor> getDoctor(@PathVariable("id") int idDoctor){
        return servicios.getDoctor(idDoctor);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public  Doctor save (@RequestBody Doctor doctor){
        return  servicios.save(doctor);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Doctor update (@RequestBody Doctor doctor) {
        return servicios.update(doctor);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delDoctor(@PathVariable("id") int idDoctor){
        Doctor doctor = new Doctor();
        doctor.setId(idDoctor);
        return servicios.delete(doctor);
    }
}
