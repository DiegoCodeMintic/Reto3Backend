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

    @Autowired
    private ServiciosReservation servicio;
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

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update (@RequestBody Reservation message) {
        return servicios.update(message);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delReserva(@PathVariable("id") int idReservation){
        Reservation reservation = new Reservation();
        reservation.setIdReservation(idReservation);
        return servicios.delete(reservation);
    }

    @GetMapping("/report-status")
    public StatusReservas getReservas() {
        return servicio.reporteStatusServicio();
    }

    @GetMapping("/report-dates/{dateOne}/{dateTwo}")
    public List<Reservation> getReservasTiempo(
            @PathVariable("dateOne") String dateOne,
            @PathVariable("dateTwo") String dateTwo
    ) {
        return servicio.reporteTiempoServicio(dateOne, dateTwo);
    }

    @GetMapping("/report-clients")
    public List<ContadorClientes> getClientes() {
        return servicio.reporteClientesServicio();
    }
}
