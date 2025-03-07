package com;

/**
 * Clase que representa a un entrenador de un equipo de fútbol.
 */
public class Entrenadores extends Trabajadores implements GestorTraspasos {
    private static int contadorEntrenadores = 0;
    private Formacion formacionPreferida;
    private Traspaso traspaso;
    private Equipos equipo;

    /**
     * Constructor para crear un nuevo entrenador.
     *
     * @param nombre             El nombre del entrenador.
     * @param fechaNacimiento    La fecha de nacimiento del entrenador.
     * @param paisOrigen         El país de origen del entrenador.
     * @param formacionPreferida La formación preferida del entrenador.
     */
    public Entrenadores(String nombre, Formacion formacionPreferida) {
        super(nombre);
        this.formacionPreferida = formacionPreferida;
        this.traspaso = Traspaso.SIN_SOLICITAR;
        contadorEntrenadores++;
    }

    /**
     * Muestra los datos básicos del entrenador.
     */
    public void mostrarDatos() {
        System.out.println("_-----------------------------------_");
        System.out.println("Nombre: " + getNombre() + "\n" + "Trabajador: Entrenador" + "\n" + "Formación preferida: " + formacionPreferida);
        if (equipo != null) {
            System.out.println("Equipo: " + equipo.getNombre());
        } else {
            System.out.println("Sin equipo asignado.");
        }
    }

    /**
     * Establece el equipo del entrenador.
     *
     * @param equipo El equipo asignado al entrenador.
     */
    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    /**
     * Obtiene el equipo del entrenador.
     *
     * @return El equipo asignado al entrenador.
     */
    public Equipos getEquipo() {
        return equipo;
    }

    /**
     * Aprueba el traspaso de un jugador si pertenece al mismo equipo.
     *
     * @param jugador El jugador que solicita el traspaso.
     */
    public void aprobarTraspaso(Jugadores jugador) {
        if (jugador.getEquipos() != null && equipo != null &&
                jugador.getEquipos().getNombre().equals(equipo.getNombre()) &&
                jugador.getTraspaso() == Traspaso.SOLICITADO) {

            jugador.setTraspaso(Traspaso.APROBADO_POR_ENTRENADOR);
            System.out.println("El entrenador " + getNombre() + " del equipo " + equipo.getNombre()
                    + " ha aprobado el traspaso de " + jugador.getNombre() + ".");
        } else {
            System.out.println("El traspaso no puede ser aprobado.");
        }
    }

    /**
     * Rechaza el traspaso de un jugador si pertenece a un equipo distinto.
     *
     * @param jugador El jugador que solicita el traspaso.
     */
    public void rechazarTraspaso(Jugadores jugador) {
        if (jugador.getTraspaso() == Traspaso.SOLICITADO) {
            jugador.setTraspaso(Traspaso.RECHAZADO_POR_ENTRENADOR);
            System.out.println("El entrenador " + getNombre() + " ha rechazado el traspaso de "
                    + jugador.getNombre() + ".");
        } else {
            System.out.println("No se puede rechazar un traspaso no solicitado.");
        }
    }

    /**
     * Entrenador en string
     */

    public String toString() {
        return "Entrenadores [nombre=" + getNombre() +
                ", formacionPreferida=" + formacionPreferida +
                (equipo != null ? ", equipo=" + equipo.getNombre() : "") + "]";
    }

    /**
     * Obtiene la formación preferida del entrenador.
     */
    public Formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    /**
     * Establece la formación preferida del entrenador.
     */
    public void setFormacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    /**
     * Obtiene el contador de entrenadores.
     */
    public static int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

    /**
     * Contador de entrenadores
     */
    public static void setContadorEntrenadores(int contadorEntrenadores) {
        Entrenadores.contadorEntrenadores = contadorEntrenadores;
    }
}
