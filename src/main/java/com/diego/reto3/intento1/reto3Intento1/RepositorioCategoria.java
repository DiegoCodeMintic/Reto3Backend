/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.reto3.intento1.reto3Intento1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

/**
 *
 * @author DiegoDevelop
 */
@Repository
public class RepositorioCategoria {
    @Autowired
    private interfaceCategoria crud;

    public List<Categoria> getAll(){
        return (List<Categoria>) crud.findAll();
    }

    public Optional <Categoria> getCategoria(int id){
        return crud.findById(id);
    }

    public Categoria save(Categoria categoria ){
        return crud.save(categoria);
    }

}