package com.diego.reto3.intento1.reto3intento1;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class serviciosCategoria {
    @Autowired
    private RepositorioCategoria metodosCrud;

    public List<Categoria> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Categoria> getCategoria(int idCategoria) {
        return metodosCrud.getCategoria(idCategoria);
    }

    public Categoria save(Categoria categoria) {
        if(categoria.getIdcategoria()==null){
            return metodosCrud.save(categoria);
        }else{
            Optional<Categoria> evt=metodosCrud.getCategoria(categoria.getIdcategoria());
            if(evt.isEmpty()){
                return metodosCrud.save(categoria);
            }else
            {
                return categoria;
            }
        }
    }
}