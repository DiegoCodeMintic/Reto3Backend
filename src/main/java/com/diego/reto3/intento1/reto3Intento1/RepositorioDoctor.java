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
        List<Doctor> listaBase = (List<Doctor>) crud.findAll();
        for(int x =0;x<  listaBase.size();x++){
            if(doctor.getId()==listaBase.get(x).getId()){
                doctor.setSpecialty(listaBase.get(x).getSpecialty());
                return crud.save(doctor);

            }
        }
        return null;
    }
    public  Doctor update (Doctor doctor){
        return  crud.save(doctor);
    }
    public boolean delete (Doctor doctor){
        List<Doctor> listaBase = (List<Doctor>) crud.findAll();
        for(int x =0;x<  listaBase.size();x++){
            if(doctor.getId()==listaBase.get(x).getId()){
                crud.delete(doctor);
                return  true;
            }
        }
        return false;
    }
}
