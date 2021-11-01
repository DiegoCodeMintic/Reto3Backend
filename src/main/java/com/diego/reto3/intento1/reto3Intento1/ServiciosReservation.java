package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ServiciosReservation {
    @Autowired
    private RepositorioReservation metodosCrud;

    public StatusReservas reporteStatusServicio (){
        List<Reservation>completed= metodosCrud.ReservacionStatusRepositorio("completed");
        List<Reservation> cancelled= metodosCrud.ReservacionStatusRepositorio("cancelled");

        return new StatusReservas(completed.size(), cancelled.size() );
    }

    public List<Reservation> reporteTiempoServicio (String datoA, String datoB){
        SimpleDateFormat parser = new SimpleDateFormat ("yyyy-MM-dd");

        Date datoUno = new Date();
        Date datoDos = new Date();

        try{
            datoUno = parser.parse(datoA);
            datoDos = parser.parse(datoB);
        }catch(ParseException evt){
            evt.printStackTrace();
        }if(datoUno.before(datoDos)){
            return metodosCrud.ReservacionTiempoRepositorio(datoUno, datoDos);
        }else{
            return new ArrayList<>();

        }
    }
    public List<ContadorClientes> reporteClientesServicio(){
        return metodosCrud.getClientesRepositorio();
    }
}
