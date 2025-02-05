
public class Entrenadores {

    public String nombre;
    public formacion formacionPreferida;
    private Traspaso traspaso;
    private Equipos equipos;

    public Entrenadores(String nombre, formacion formacionPreferida) {
        this.nombre = nombre;
        this.formacionPreferida = formacionPreferida;
        // System.out.println("estamos en entrenadores");
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
                jugador.setTraspaso(traspaso.APROBADO_POR_ENTRENADOR );
                System.out.println("El entrenador ha aceptado el traspaso de  " + jugador.getNombre());
            } else {
                jugador.setTraspaso(traspaso.RECHAZADO_POR_ENTRENADOR);
                System.out.println("El entrenador ha rechazado la solicitud de " + jugador.getNombre());
            }
        }
    }
}
