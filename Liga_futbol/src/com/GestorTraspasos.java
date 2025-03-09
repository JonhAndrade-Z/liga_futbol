package com;

/**
 * Interfaz que define los metodos para gestionar los traspasos de jugadores.
 */
public interface GestorTraspasos {

    /**
     * Aprueba el traspaso de un jugador.
     *
     * @param jugadores El jugador que solicita el traspaso.
     */
    void aprobarTraspaso(Jugadores jugadores);

    /**
     * Rechaza el traspaso de un jugador.
     *
     * @param jugadores El jugador que solicita el traspaso.
     */
    void rechazarTraspaso(Jugadores jugadores);
}