package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioReservation {
    @Autowired
    private interfaceReservation crud;
    public List<Reservation> getAll(){
        return (List<Reservation>) crud.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return crud.findById(id);
    }
    public Reservation save(Reservation reservation ){
        return crud.save(reservation);
    }

    public  Reservation update (Reservation reservation){
        return crud.save(reservation);
    }
    public boolean delete (Reservation reservation){
        crud.delete(reservation);
        return  true;
    }
}
