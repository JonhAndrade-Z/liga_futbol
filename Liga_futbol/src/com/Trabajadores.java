package com;

import java.util.Date;

public abstract class Trabajadores {

    public String nombre;
    public Date fechaNacimiento;
    public String paisOrigen;

    public Trabajadores(String nombre, Date fechaNacimiento, String paisOrigen) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;

    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public Trabajadores(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Trabajadores(String nombre) {
        this.nombre = nombre;
    }

    public String mismaNacionalidad(Trabajadores trabajador) {
        if (trabajador != null && this.paisOrigen != null && this.paisOrigen.equals(trabajador.paisOrigen)) {
            return "Tienen la misma nacionalidad";
        } else {
            return "No tienen la misma nacionalidad";
        }
    }

    public abstract void mostrarDatos();
}
