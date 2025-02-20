package com;

import java.util.Date;

public class Trabajadores {
 
    public String nombre;
    public Date fechaNacimiento;  
    public String paisOrigen;

    public Trabajadores(String nombre, Date fechaNacimiento, String paisOrigen) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
      
    }
    public Trabajadores(String nombre, Date fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public Trabajadores(String nombre){
        this.nombre = nombre;
    }


    public String mismaNacionalidad(Trabajadores trabajador) {
        if (this.paisOrigen.equals(trabajador.paisOrigen)) {
            return "Tienen la misma nacionalidad";
        } else {
            return "No tienen la misma nacionalidad";
        }
    }
    

}
