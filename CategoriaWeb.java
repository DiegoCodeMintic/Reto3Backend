package com.diego.reto3.intento1.reto3intento1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Category")
public class CategoriaWeb {

    @GetMapping("/holaMundo")
    public String saludar(){
        return "Hola Mundo Colombia";
    }

}