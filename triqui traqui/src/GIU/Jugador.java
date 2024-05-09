/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;

import java.awt.Color;

/**
 *
 * @author Lenovo
 */
public class Jugador {
    private String nombre;
    private String ficha;
    private String color;
    
    
    public Jugador (String nombre){
        this.nombre= nombre;
    }
    
    public Jugador(String nombre, String color){
        this.nombre=nombre;
        this.color=color;
    }
    
    public Jugador (String nombre, String ficha, String color){
        this.nombre=nombre;
        this.ficha=ficha;
        this.color=color;
    }
    

    public String obtenerNombre(){
        return nombre;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }
    
    
    
    
}
