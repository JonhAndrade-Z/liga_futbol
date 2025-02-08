<<<<<<< Updated upstream:Liga_futbol/src/Traspaso.java
=======
package com;

/**
 * Enumeracion que representa los diferentes estados de traspaso de un jugador.
 */
>>>>>>> Stashed changes:Liga_futbol/src/com/Traspaso.java
public enum Traspaso {

    /**
     * Estado inicial, sin solicitud de traspaso.
     */
    SIN_SOLICITAR,
    /**
     * Estado cuando el jugador ha solicitado el traspaso.
     */

    SOLICITADO,

    /**
     * Estado cuando el traspaso ha sido aprobado por el entrenador.
     */
    APROBADO_POR_ENTRENADOR,

    /**
     * Estado cuando el traspaso ha sido aprobado por el presidente.
     */
    APROBADO_POR_PRESIDENTE,
    /**
     * Estado cuando el traspaso ha sido rechazado por el entrenador.
     */
    RECHAZADO_POR_ENTRENADOR,
    /**
     * Estado cuando el traspaso ha sido rechazado por el presidente.
     */
    RECHAZADO_POR_PRESIDENTE;
}
