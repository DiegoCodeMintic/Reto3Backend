/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.reto3.intento1.reto3Intento1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DiegoDevelop
 */
@RestController
@RequestMapping("/api/Inicio")
public class ControladorInicio {
    @GetMapping("/uno")
    public String saludar(){
        return "Hola diego from server";
    }
}
