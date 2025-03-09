package com;

import java.util.Date;

/**
 * Clase abstracta que define los atributos y metodos de los trabajadores
 */

public abstract class Trabajadores {

    /**
     * Nombre del trabajador
     */
    public String nombre;
    /**
     * Fecha de nacimiento del trabajador
     */
    public Date fechaNacimiento;
    /**
     * Pais de origen del trabajador
     */
    public String paisOrigen;

    /**
     * Constructor para crear un nuevo trabajador.
     *
     * @param nombre          El nombre del trabajador.
     * @param fechaNacimiento La fecha de nacimiento del trabajador.
     * @param paisOrigen      El país de origen del trabajador.
     */

    public Trabajadores(String nombre, Date fechaNacimiento, String paisOrigen) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;

    }

    /**
     * Obtiene el nombre del trabajador.
     *
     * @return Nombre del trabajador.
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la fecha de nacimiento del trabajador.
     *
     * @return Fecha de nacimiento del trabajador.
     */

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Obtiene el país de origen del trabajador.
     *
     * @return País de origen del trabajador.
     */

    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Constructor que inicializa un trabajador con nombre y fecha de nacimiento.
     *
     * @param nombre          Nombre del trabajador.
     * @param fechaNacimiento Fecha de nacimiento del trabajador.
     */

    public Trabajadores(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Constructor que inicializa un trabajador solo con nombre.
     *
     * @param nombre Nombre del trabajador.
     */

    public Trabajadores(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Verifica si el trabajador tiene la misma nacionalidad que otro trabajador.
     *
     * @param trabajador El otro trabajador con el que se va a comparar.
     */

    public void mismaNacionalidad(Trabajadores trabajador) {
        if (trabajador != null && this.paisOrigen != null && this.paisOrigen.equals(trabajador.paisOrigen)) {
            System.out.println("_-----------------------------------_");
            System.out.println(
                    "El jugador " + getNombre() + " tiene la misma nacionalidad que " + trabajador.getNombre());
        } else {
            System.out.println("_-----------------------------------_");
            System.out.println(
                    "El jugador " + getNombre() + " no tiene la misma nacionalidad que " + trabajador.getNombre());
        }
    }

    /**
     * Método abstracto para mostrar los datos del trabajador.
     * Se implementa en las clases hijas.
     */

    public abstract void mostrarDatos();

}
