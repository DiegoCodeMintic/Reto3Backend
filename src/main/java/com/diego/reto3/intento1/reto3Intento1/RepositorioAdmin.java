package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioAdmin {
    @Autowired
    private interfaceAdmin crud;
    public List<Admin> getAll() {
        return (List<Admin>) crud.findAll();
    }
    public Optional<Admin> getAdmin(int id) {
        return crud.findById(id);
    }
    public Admin save(Admin admin) {
        return crud.save(admin);
    }
    public  Admin update (Admin admin){
        return crud.save(admin);
    }
    public boolean delete (Admin admin){
        crud.delete(admin);
        return  true;
    }
}
