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
        System.out.println("Nombre: " + nombre + "\n" + "Trabajador: Jugador" + "\n" + "Dorsal: " + dorsal + "\n"
                + "Posición: " + posicion);

    }

    // getters setters

    /**
     * Obtiene el dorsal del jugador.
     *
     * @return El dorsal del jugador.
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Establece dorsal del jugador
     * 
     * @param dorsal el nuevo dorsal del jugador.
     */
    public void setDorsal(int dorsal) {
        if (dorsal <= 0) {
            System.out.println("El dorsal no es correcto.");
        } else {
            this.dorsal = dorsal;
        }
    }

    /**
     * Obtiene la posición del jugador.
     *
     * @return La posición del jugador.
     */
    public Posicion getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición del jugador.
     *
     * @param posicion La nueva posición del jugador.
     */
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    /**
     * Obtiene el estado de traspaso del jugador.
     *
     * @return El estado de traspaso del jugador.
     */

    public Traspaso getTraspaso() {
        return traspaso;
    }

    /**
     * Establece el estado de traspaso del jugador.
     *
     * @param traspaso El nuevo estado de traspaso del jugador.
     */

    public void setTraspaso(Traspaso traspaso) {
        this.traspaso = traspaso;
    }

    /**
     * Obtiene el equipo del jugador.
     *
     * @return El equipo del jugador.
     */

    public Equipos getEquipos() {
        return equipos;
    }

    /**
     * Establece el equipo del jugador.
     *
     * @param equipos El nuevo equipo del jugador.
     */
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

    /**
     * Establece el contador de jugadores.
     *
     * @param contadorJugadores El nuevo valor del contador de jugadores.
     */
    public static void setContadorJugadores(int contadorJugadores) {
        Jugadores.contadorJugadores = contadorJugadores;
    }

    /**
     * Devuelve una representación en cadena del jugador.
     *
     * @return Una cadena que representa al jugador.
     */
    public String toString() {
        return "Jugadores [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", paisOrigen=" + paisOrigen
                + ", dorsal=" + dorsal + ", posicion=" + posicion + ", traspaso=" + traspaso + ", equipo=" + equipos
                + "]";
    }
}
