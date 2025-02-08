package com;
public class Presidentes {

    private static int contadorPresidentes = 0;

    private String nombre;
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

        this.nombre = nombre;
        this.DNI = DNI;
        contadorPresidentes++;
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
     * @param equipo El equipo del presidente.
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
     * @param DNI El DNI del presidente.
     */
    public void setDNI(String dNI) {
        DNI = dNI;
    }

    /**
     * Realiza la aprobación o rechazo del traspaso de un jugador.
     * 
     * @param jugador El jugador que solicita el traspaso.
     */
    public void presidenteTraspaso(Jugadores jugador) {

        if (jugador.getEquipos().getNombre().equals(equipos.getNombre())) {

            if (jugador.getTraspaso() == traspaso.APROBADO_POR_ENTRENADOR && jugador.getEquipos() == this.equipos) {
                jugador.setTraspaso(traspaso.APROBADO_POR_PRESIDENTE);
                System.out.println("El presidente " + nombre + " del equipo " + equipos.getNombre()
                        + " ha aceptado el traspaso de  " + jugador.getNombre() + " \n");
            } else {
                jugador.setTraspaso(traspaso.RECHAZADO_POR_PRESIDENTE);
                System.out.println("El presidente ha rechazado la solicitud de " + jugador.getNombre() + "\n");
            }
        } else {
            System.out.println(
                    "El presidente " + nombre + " no es el presidente del equipo de " + jugador.getNombre() + "\n");

        }

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
