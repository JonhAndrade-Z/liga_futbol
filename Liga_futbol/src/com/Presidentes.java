package com;

/**
 * Clase que representa a los presidentes de los equipos de futbol.
 */
public class Presidentes extends Trabajadores implements GestorTraspasos {

    private static int contadorPresidentes = 0;

    private String DNI;
    private Traspaso traspaso;
    private Equipos equipos;
    private Entrenadores entrenadores;

    /**
     * Constructor para crear un nuevo presidente.
     * 
     * @param nombre El nombre del presidente.
     * @param DNI    El DNI del presidente.
     */

    public Presidentes(String nombre, String DNI) {

        super(nombre);
        this.DNI = DNI;
        contadorPresidentes++;
    }

    public void mostrarDatos() {
        System.out.println("_-----------------------------------_");
        System.out.println("Nombre: " + getNombre() + "\n" + "Trabajador: Presidente");

        if (getEquipo() != null) {
            System.out.println("Equipo: " + getEquipo().getNombre());
        }
    }

    /**
     * Establece el equipo del presidente.
     * 
     * @param equipo El equipo del presidente.
     */
    public void setEquipo(Equipos equipo) {
        this.equipos = equipo;
    }

    /**
     * Obtiene el equipo del presidente.
     * 
     * @return El equipo del presidente.
     */
    public Equipos getEquipo() {
        return equipos;
    }

    /**
     * Obtiene el nombre del presidente.
     * 
     * @return El nombre del presidente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve una representación en cadena del presidente.
     * 
     * @return Una cadena que representa al presidente.
     */
    public String toString() {
        return "Presidentes [nombre=" + nombre + ", DNI=" + DNI + "]";
    }

    /**
     * Establece el nombre del presidente.
     * 
     * @param nombre El nombre del presidente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el DNI del presidente.
     * 
     * @return El DNI del presidente.
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Establece el DNI del presidente.
     * 
     * @param dNI El DNI del presidente.
     */
    public void setDNI(String dNI) {
        DNI = dNI;
    }

    /**
     * Realiza la aprobación o rechazo del traspaso de un jugador.
     * 
     * @param jugador El jugador que solicita el traspaso.
     */

    // public void aprobarTraspaso(Jugadores jugador) {
    //     if (jugador.getEquipos() == this.equipos && jugador.getTraspaso() == Traspaso.APROBADO_POR_ENTRENADOR) {
    //         jugador.setTraspaso(Traspaso.APROBADO_POR_PRESIDENTE);
    //         System.out.println("El presidente " + nombre + " ha aprobado el traspaso de " + jugador.getNombre());
    //     }
    // }

    public void aprobarTraspaso(Jugadores jugador) {
        if (jugador.getEquipos() != equipos) {
            System.out.println("");
            return;
        }
        if (jugador.getTraspaso() != Traspaso.APROBADO_POR_ENTRENADOR) {
            System.out.println("");
            return;
        }
        jugador.setTraspaso(Traspaso.APROBADO_POR_ENTRENADOR);
        System.out.println("El presidente " + nombre + " ha aprobado el traspaso de " + jugador.getNombre());

    }

    public void rechazarTraspaso(Jugadores jugador) {
        jugador.setTraspaso(Traspaso.RECHAZADO_POR_PRESIDENTE);
        System.out.println("El presidente " + nombre + " ha rechazado el traspaso de " + jugador.getNombre());
    }

    /**
     * Obtiene el contador de presidentes.
     * 
     * @return El contador de presidentes.
     */
    public static int getContadorPresidentes() {
        return contadorPresidentes;
    }

    /**
     * Establece el contador de presidentes.
     * 
     * @param contadorPresidentes El contador de presidentes.
     */
    public static void setContadorPresidentes(int contadorPresidentes) {
        Presidentes.contadorPresidentes = contadorPresidentes;
    }

    /**
     * Obtiene el estado de traspaso del presidente.
     * 
     * @return El estado de traspaso del presidente.
     */
    public Traspaso getTraspaso() {
        return traspaso;
    }

    /**
     * Establece el estado de traspaso del presidente.
     * 
     * @param traspaso El estado de traspaso del presidente.
     */
    public void setTraspaso(Traspaso traspaso) {
        this.traspaso = traspaso;
    }

    /**
     * Obtiene el equipo del presidente.
     * 
     * @return El equipo del presidente.
     */
    public Equipos getEquipos() {
        return equipos;
    }

    /**
     * Establece el equipo del presidente.
     * 
     * @param equipos El equipo del presidente.
     */
    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    /**
     * Obtiene el entrenador del presidente.
     * 
     * @return El entrenador del presidente.
     */
    public Entrenadores getEntrenadores() {
        return entrenadores;
    }

    /**
     * Establece el entrenador del presidente.
     * 
     * @param entrenadores El entrenador del presidente.
     */
    public void setEntrenadores(Entrenadores entrenadores) {
        this.entrenadores = entrenadores;
    }

}
