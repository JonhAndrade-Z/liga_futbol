import java.util.ArrayList;
public class Equipos {

    private String nombre;
    public String abreviatura;
    private Presidentes presidentes;
    private Entrenadores entrenadores;
    private ArrayList<Jugadores> jugadores;

    public Equipos(String nombre, String abreviatura) {

        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.jugadores = new ArrayList<>();
        // System.out.println("estamos en equipos");

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

    public void anadirJugador(Jugadores jug){
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



}
