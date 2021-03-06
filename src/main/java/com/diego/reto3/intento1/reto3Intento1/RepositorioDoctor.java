package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioDoctor {
    @Autowired
    private interfaceDoctor crud;

    public List<Doctor> getAll() {
        return (List<Doctor>) crud.findAll();
    }

    public Optional<Doctor> getDoctor(int id) {
        return crud.findById(id);
    }

    public Doctor save(Doctor doctor) {
        return crud.save(doctor);
    }
}
