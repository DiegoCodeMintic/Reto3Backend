package com.diego.reto3.intento1.reto3Intento1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Reservation")
public class ReservationWeb {
    @Autowired(required = true)
    private RepositorioReservation servicios;
    @GetMapping("/all")
    public List<Reservation> getReservation(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Reservation> getCategoria(@PathVariable("id") int idReservation) {
        return servicios.getReservation(idReservation);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation) {
        return servicios.save(reservation);
    }
}
