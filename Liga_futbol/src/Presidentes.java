public class Presidentes {
    private static int contadorPresidentes = 0;

    private String nombre;
    private String DNI;
    private Traspaso traspaso;
    private Equipos equipos;
    private Entrenadores entrenadores;

    public Presidentes(String nombre, String DNI) {

        this.nombre = nombre;
        this.DNI = DNI;
        contadorPresidentes++;
    }

    public static int getContadorPresidentes() {
        return contadorPresidentes;
    }

    public void setEquipo(Equipos equipo) {
        this.equipos = equipo;
    }

    public void getEquipo(Equipos equipo) {

    }

    public String toString() {
        return "Presidentes [nombre=" + nombre + ", DNI=" + DNI + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void presidenteTraspaso(Jugadores jugador) {

        if (jugador.getEquipos().getNombre() == (equipos.getNombre())) {

            if (jugador.getTraspaso() == traspaso.APROBADO_POR_ENTRENADOR && jugador.getEquipos() == this.equipos) {
                jugador.setTraspaso(traspaso.APROBADO_POR_PRESIDENTE);
                System.out.println("El presidente " + nombre + " del equipo " + equipos.getNombre()
                        + " ha aceptado el traspaso de  " + jugador.getNombre());
            } else {
                jugador.setTraspaso(traspaso.RECHAZADO_POR_PRESIDENTE);
                System.out.println("El presidente ha rechazado la solicitud de " + jugador.getNombre());
            }
        }
    }

    public void rechazarTraspaso(Jugadores jugador) {
        if (jugador.getEquipos().getNombre() == this.equipos.getNombre()) {
            if (jugador.getTraspaso() == traspaso.APROBADO_POR_ENTRENADOR && jugador.getEquipos() == this.equipos) {
                jugador.setTraspaso(traspaso.RECHAZADO_POR_PRESIDENTE);
                System.out.println("El presidente " + nombre + " del equipo " + equipos.getNombre()
                        + "ha rechazado el traspaso de  " + jugador.getNombre());
            } else {
                System.out.println("El traspaso ha sido rechazado por el entrenador.");
            }
        }
    }

}
