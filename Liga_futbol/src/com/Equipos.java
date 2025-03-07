package com;

import java.util.ArrayList;

/**
 * Clase que representa a un equipo de futbol.
 */

public class Equipos {

    private static int contadorEquipos = 0;

    private String nombre;
    public String abreviatura;
    private Presidentes presidentes;
    private Entrenadores entrenadores;
    private ArrayList<Jugadores> jugadores;
    private Traspaso traspaso;

    /**
     * Constructor para crear un nuevo equipo.
     * 
     * @param nombre      El nombre del equipo.
     * @param abreviatura La abreviatura del equipo.
     */
    public Equipos(String nombre, String abreviatura) {

        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.jugadores = new ArrayList<>();
        contadorEquipos++;
    }

    /**
     * Establece el presidente del equipo.
     * 
     * @param presidentes El presidente del equipo.
     */
    public void setPresidentes(Presidentes presidentes) {
        this.presidentes = presidentes;
    }

    /**
     * Establece el entrenador del equipo.
     * 
     * @param entrenadores El entrenador del equipo.
     */
    public void setEntrenadores(Entrenadores entrenadores) {
        this.entrenadores = entrenadores;
    }

    /**
     * Establece la lista de jugadores del equipo.
     * 
     * @param jugadores La lista de jugadores del equipo.
     */
    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * Añade un jugador al equipo.
     * 
     * @param jug El jugador a añadir.
     */
    public void anadirJugador(Jugadores jug) {
        this.jugadores.add(jug);
    }

    /**
     * Devuelve una representación en cadena del equipo.
     * 
     * @return Una cadena que representa al equipo.
     */
    public String toString() {
        return "Equipos [nombre=" + nombre + ", abreviatura=" + abreviatura + ", presidentes=" + presidentes
                + ", entrenadores=" + entrenadores + ", jugadores=" + jugadores + "]";
    }

    /**
     * Obtiene el nombre del equipo.
     * 
     * @return El nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la abreviatura del equipo.
     * 
     * @return La abreviatura del equipo.
     */
    public String getAbreviatura() {
        return abreviatura;
    }

    /**
     * Obtiene el presidente del equipo.
     * 
     * @return El presidente del equipo.
     */
    public Presidentes getPresidentes() {
        return presidentes;
    }

    /**
     * Obtiene el entrenador del equipo.
     * 
     * @return El entrenador del equipo.
     */
    public Entrenadores getEntrenadores() {
        return entrenadores;
    }

    /**
     * Obtiene la lista de jugadores del equipo.
     * 
     * @return La lista de jugadores del equipo.
     */
    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    /**
     * Realiza el traspaso de un jugador a otro equipo.
     * 
     * @param jugador       El jugador a traspasar.
     * @param equipoDestino El equipo de destino del jugador.
     */

    public void realizarTraspaso(Jugadores jugador, Equipos equipoDestino) {
        Presidentes presidenteActual = this.getPresidentes();
        Entrenadores entrenadorActual = this.getEntrenadores();

        if (jugador.getEquipos().equals(this) &&
                this.getEntrenadores().equals(entrenadorActual) &&
                this.getPresidentes().equals(presidenteActual)) {

            if (jugador.getTraspaso() == traspaso.APROBADO_POR_PRESIDENTE) {
                this.jugadores.remove(jugador);

                this.anadirJugador(jugador);

                jugador.setEquipo(equipoDestino);

                jugador.setTraspaso(traspaso.SIN_SOLICITAR);

            }

            System.out.println(jugador.getNombre() + " ahora es del equipo: " +
                    equipoDestino.getNombre());
            System.out.println("-------------------------------");
        } else {
            System.out.println(
                    "ERROR: " + jugador.getNombre() + " no pertenece al equipo de " +
                            presidenteActual.getNombre() +
                            " y " + entrenadorActual.getNombre() + ". Traspaso no autorizado.");
            System.out.println("-------------------------------");

        }
    }

    /**
     * Obtiene el contador de equipos.
     * 
     * @return El contador de equipos.
     */

    public static int getContadorEquipos() {
        return contadorEquipos;
    }

    /**
     * Obtiene el estado de traspaso del equipo.
     * 
     * @return El estado de traspaso del equipo.
     */
    
    public Traspaso getTraspaso() {
        return traspaso;
    }

}
