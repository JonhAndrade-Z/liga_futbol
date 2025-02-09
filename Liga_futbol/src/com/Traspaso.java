package com;

/**
 * Enum que representa el estado de un traspaso.
 */

public enum Traspaso {

    /** Estado cuando el traspaso no ha sido solicitado. */
    SIN_SOLICITAR,

    /** Estado cuando el traspaso ha sido solicitado. */
    SOLICITADO,

    /** Estado cuando el traspaso ha sido aprobado por el entrenador. */
    APROBADO_POR_ENTRENADOR,

    /** Estado cuando el traspaso ha sido aprobado por el presidente. */
    APROBADO_POR_PRESIDENTE,

    /** Estado cuando el traspaso ha sido rechazado por el entrenador. */
    RECHAZADO_POR_ENTRENADOR,

    /** Estado cuando el traspaso ha sido rechazado por el presidente. */
    RECHAZADO_POR_PRESIDENTE;
}
