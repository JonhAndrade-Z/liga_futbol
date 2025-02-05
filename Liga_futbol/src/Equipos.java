import java.util.ArrayList;

public class Equipos {

    private String nombre;
    public String abreviatura;
    private Presidentes presidentes;
    private Entrenadores entrenadores;
    private ArrayList<Jugadores> jugadores;
    private Traspaso traspaso;

    public Equipos(String nombre, String abreviatura) {

        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.jugadores = new ArrayList<>();
    }

    public void setPresidentes(Presidentes presidentes) {
        this.presidentes = presidentes;
    }

    public void setEntrenadores(Entrenadores entrenadores) {
        this.entrenadores = entrenadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    public void anadirJugador(Jugadores jug) {
        this.jugadores.add(jug);
    }

    public String toString() {
        return "Equipos [nombre=" + nombre + ", abreviatura=" + abreviatura + ", presidentes=" + presidentes
                + ", entrenadores=" + entrenadores + ", jugadores=" + jugadores + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public Presidentes getPresidentes() {
        return presidentes;
    }

    public Entrenadores getEntrenadores() {
        return entrenadores;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void seRealizaElTraspasoDelJugador(Jugadores jugador, Equipos nuevoEquipo) {

        if (jugador.getTraspaso() == traspaso.APROBADO_POR_PRESIDENTE) {
            this.jugadores.remove(jugador);

            nuevoEquipo.anadirJugador(jugador);

            jugador.setEquipos(nuevoEquipo);

            jugador.setTraspaso(traspaso.SIN_SOLICITAR);

            System.out.println("El traspaso de " + jugador.getNombre() + " se ha realizado con exito al equipo " + nuevoEquipo.getNombre() ) ;
        }
    }

    

}
