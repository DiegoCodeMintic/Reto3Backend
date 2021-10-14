package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioSpecialty {
    @Autowired
    private interfaceSpecialty crud;

    public List<Specialty> getAll(){
        return (List<Specialty>) crud.findAll();
    }
    public Optional<Specialty> getSpecialty(int id){
        return  crud.findById(id);
    }
    public  Specialty save (Specialty specialty){
        return  crud.save(specialty);

    }
}
