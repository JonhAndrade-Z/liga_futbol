package com;
import java.util.Date;

public class Jugadores {
    private static int contadorJugadores = 0;

    private String nombre;
    private Date fechaNacimiento;
    private String paisOrigen;
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
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.traspaso = Traspaso.SIN_SOLICITAR;

        contadorJugadores++;
    }

    /**
     * Obtiene el nombre del jugador.
     * 
     * @return El nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del jugador.
     * 
     * @param nombre El nombre del jugador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el país de origen del jugador.
     * 
     * @return El país de origen del jugador.
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Establece el país de origen del jugador.
     * 
     * @param paisOrigen El país de origen del jugador.
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    /**
     * Obtiene el número dorsal del jugador.
     * 
     * @return El número dorsal del jugador.
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Establece el número dorsal del jugador.
     * 
     * @param dorsal El número dorsal del jugador.
     */
    public void setDorsal(int dorsal) {
        if (dorsal <= 0) {
            System.out.println("el dorsal no puede es correcto");
        }

        this.dorsal = dorsal;
    }

    /**
     * Obtiene la fecha de nacimiento del jugador.
     * 
     * @return La fecha de nacimiento del jugador.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del jugador.
     * 
     * @param fechaNacimiento La fecha de nacimiento del jugador.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Establece el equipo del jugador.
     * 
     * @param equipos El equipo del jugador.
     */
    public void setEquipo(Equipos equipos) {
        this.equipos = equipos;
    }

    /**
     * Devuelve una representación en cadena del jugador.
     * 
     * @return Una cadena que representa al jugador.
     */
    public String toString() {
        return "Jugadores [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", paisOrigen=" + paisOrigen
                + ", dorsal=" + dorsal + ", posicion=" + posicion + ", traspaso=" + traspaso + ", equipos=" + equipos
                + "]";
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
     * @param posicion La posición del jugador.
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
     * @param traspaso El estado de traspaso del jugador.
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
     * @param equipos El equipo del jugador.
     */
    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    /**
     * Solicita el traspaso del jugador.
     */
    public void solicitarTraspaso() {
        if (traspaso == traspaso.SIN_SOLICITAR) {
            traspaso = traspaso.SOLICITADO;
            System.out.println(
                    "El jugador " + nombre + " del equipo " + equipos.getNombre() + " ha solicitado el traspaso \n");
        } else {
            System.out.println("El jugador " + nombre + " ya ha solicitado el traspaso o no puede hacerlo \n");
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
     * @param contadorJugadores El contador de jugadores.
     */
    public static void setContadorJugadores(int contadorJugadores) {
        Jugadores.contadorJugadores = contadorJugadores;
    }

}
