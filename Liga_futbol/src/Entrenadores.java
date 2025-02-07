
public class Entrenadores {
    private static int contadorEntrenadores = 0;
    public String nombre;
    public formacion formacionPreferida;
    private Traspaso traspaso;
    private Equipos equipos;

    /**
     * Constructor para crear un nuevo entrenador.
     * 
     * @param nombre             El nombre del entrenador.
     * @param formacionPreferida La formación preferida del entrenador.
     */
    public Entrenadores(String nombre, formacion formacionPreferida) {
        this.nombre = nombre;
        this.formacionPreferida = formacionPreferida;
        contadorEntrenadores++;
    }

    /**
     * Establece el equipo del entrenador.
     * 
     * @param equipos El equipo del entrenador.
     */

    public void setEquipo(Equipos equipos) {
        this.equipos = equipos;
    }

    /**
     * Devuelve una representación en cadena del entrenador.
     * 
     * @return Una cadena que representa al entrenador.
     */
    public String toString() {
        return "Entrenadores [nombre=" + nombre + ", formacionPreferida=" + formacionPreferida + "]";
    }

    /**
     * Obtiene el nombre del entrenador.
     * 
     * @return El nombre del entrenador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del entrenador.
     * 
     * @param nombre El nombre del entrenador.
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la formación preferida del entrenador.
     * 
     * @return La formación preferida del entrenador.
     */

    public formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    /**
     * Establece la formación preferida del entrenador.
     * 
     * @param formacionPreferida La formación preferida del entrenador.
     */

    public void setFormacionPreferida(formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    /**
     * @param jugador
     *                se recibe el jugador que solicita el traspaso
     *                se crea la condicon aplicacble para la
     *                aprobacion del traspaso por parte del entrenador
     * 
     * @return
     *         se retorna el traspaso aprobado o rechazado
     */
    public void entrenadorTraspaso(Jugadores jugador) {

        if (jugador.getEquipos().getNombre() == (this.equipos.getNombre())) {

            if (jugador.getTraspaso() == traspaso.SOLICITADO && jugador.getEquipos() == this.equipos) {
                jugador.setTraspaso(traspaso.APROBADO_POR_ENTRENADOR);
                System.out.println("El entrenador " + nombre + " del equipo " + equipos.getNombre()
                        + " ha aceptado el traspaso de  "
                        + jugador.getNombre() + "\n");
            }
        } else {
            if (jugador.getEquipos().getNombre() != (this.equipos.getNombre())) {
                if (jugador.getTraspaso() == traspaso.SOLICITADO) {
                    jugador.setTraspaso(traspaso.RECHAZADO_POR_ENTRENADOR);
                    System.out.println("El entrenador " + nombre + " ha rechazado el traspaso \n");
                }
            }
        }

    }

    /**
     * Obtiene el contador de entrenadores.
     * 
     * @return El contador de entrenadores.
     */
    public static int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

    /**
     * Establece el contador de entrenadores.
     * 
     * @param contadorEntrenadores El contador de entrenadores.
     */
    public static void setContadorEntrenadores(int contadorEntrenadores) {
        Entrenadores.contadorEntrenadores = contadorEntrenadores;
    }

    /**
     * Obtiene el estado de traspaso del entrenador.
     * 
     * @return El estado de traspaso del entrenador.
     */
    public Traspaso getTraspaso() {
        return traspaso;
    }

    /**
     * Establece el estado de traspaso del entrenador.
     * 
     * @param traspaso El estado de traspaso del entrenador.
     */
    public void setTraspaso(Traspaso traspaso) {
        this.traspaso = traspaso;
    }

    /**
     * Obtiene el equipo del entrenador.
     * 
     * @return El equipo del entrenador.
     */
    public Equipos getEquipos() {
        return equipos;
    }

    /**
     * Establece el equipo del entrenador.
     * 
     * @param equipos El equipo del entrenador.
     */
    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

}
