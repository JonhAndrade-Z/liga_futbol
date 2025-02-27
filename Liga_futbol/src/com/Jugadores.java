package com;

import java.util.Date;

/**
 * Clase que representa a un jugador de fútbol.
 */
public class Jugadores extends Trabajadores {
    private static int contadorJugadores = 0;

    private int dorsal;
    private Posicion posicion;
    private Traspaso traspaso;
    private Equipos equipos;

    /**
     * Constructor para crear un nuevo jugador.
     *
     * @param nombre          El nombre del jugador.
     * @param fechaNacimiento La fecha de nacimiento del jugador.
     * @param paisOrigen      El país de origen del jugador.
     * @param dorsal          El número dorsal del jugador.
     * @param posicion        La posición en la que juega el jugador.
     */
    public Jugadores(String nombre, Date fechaNacimiento, String paisOrigen, int dorsal, Posicion posicion) {
        super(nombre, fechaNacimiento, paisOrigen); // Llama al constructor de Trabajadores
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.traspaso = Traspaso.SIN_SOLICITAR;
        contadorJugadores++;
    }

    /**
     * datos del jugador.
     */

    public void mostrarDatos() {
        System.out.println("_-----------------------------------_");
        System.out.println("Nombre: " + nombre + "\n" +  "Trabajador: Jugador" + "\n" +  "Dorsal: " + dorsal + "\n" + "Posición: " + posicion);
 
    }

    // getters setters

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal <= 0) {
            System.out.println("El dorsal no es correcto.");
        } else {
            this.dorsal = dorsal;
        }
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Traspaso getTraspaso() {
        return traspaso;
    }

    public void setTraspaso(Traspaso traspaso) {
        this.traspaso = traspaso;
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipo(Equipos equipos) {
        this.equipos = equipos;
    }

    /**
     * Solicita el traspaso del jugador.
     */
    public void solicitarTraspaso() {
        if (traspaso == Traspaso.SIN_SOLICITAR) {
            traspaso = Traspaso.SOLICITADO;
            System.out.println(
                    "El jugador " + nombre + " del equipo " + equipos.getNombre() + " ha solicitado el traspaso.");
        } else {
            System.out.println("El jugador " + nombre + " ya ha solicitado el traspaso o no puede hacerlo.");
        }
    }

    /**
     * Obtiene el contador de jugadores.
     *
     * @return El contador de jugadores.
     */
    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    public static void setContadorJugadores(int contadorJugadores) {
        Jugadores.contadorJugadores = contadorJugadores;
    }

    // para imprimir jugadores
    public String toString() {
        return "Jugadores [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", paisOrigen=" + paisOrigen
                + ", dorsal=" + dorsal + ", posicion=" + posicion + ", traspaso=" + traspaso + ", equipo=" + equipos
                + "]";
    }
}
