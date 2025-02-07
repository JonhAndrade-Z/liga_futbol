
public class Entrenadores {
    private static int contadorEntrenadores = 0;
    public String nombre;
    public formacion formacionPreferida;
    private Traspaso traspaso;
    private Equipos equipos;

    public Entrenadores(String nombre, formacion formacionPreferida) {
        this.nombre = nombre;
        this.formacionPreferida = formacionPreferida;
        contadorEntrenadores++;
    }

    public static int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

    public void setEquipo(Equipos equipos) {
        this.equipos = equipos;
    }

    public String toString() {
        return "Entrenadores [nombre=" + nombre + ", formacionPreferida=" + formacionPreferida + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    public void entrenadorTraspaso(Jugadores jugador) {

        if (jugador.getEquipos().getNombre() == (this.equipos.getNombre())) {

            if (jugador.getTraspaso() == traspaso.SOLICITADO && jugador.getEquipos() == this.equipos) {
                jugador.setTraspaso(traspaso.APROBADO_POR_ENTRENADOR);
                System.out.println("El entrenador " + nombre + " del equipo " + equipos.getNombre()
                        + " ha aceptado el traspaso de  " + jugador.getNombre());
            } else {

                System.out.println("El traspaso ya ha sido solicitado o no esta en estado solicitado.");
            }
        }
    }

    public void rechazarTraspaso(Jugadores jugador) {
        if (jugador.getEquipos().getNombre() == this.equipos.getNombre()) {
            if (jugador.getTraspaso() == traspaso.SOLICITADO && jugador.getEquipos() == this.equipos) {
                jugador.setTraspaso(traspaso.RECHAZADO_POR_ENTRENADOR);
                System.out.println("El entrenador " + nombre + " del equipo " + equipos.getNombre()
                        + "ha rechazado el traspaso de  " + jugador.getNombre());
            } else {
                System.out.println("El traspaso ya ha sido solicitado o no esta en estado solicitado.");
            }
        }
    }
}
