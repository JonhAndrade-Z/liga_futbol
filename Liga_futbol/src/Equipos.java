public class Equipos {

    public String nombre;
    public String abreviatura;
    private Presidentes presidentes;
    private Entrenadores entrenadores;

    public Equipos(String nombre, String abreviatura) {

        this.nombre = nombre;
        this.abreviatura = abreviatura;
        System.out.println("Estamos dentro del constructor de Equipos");
    }

    public void setPresidentes(Presidentes presidentes) {
        this.presidentes = presidentes;

    }

    public void setEntrenadores(Entrenadores Entrenadores) {
        this.entrenadores = Entrenadores;

    }

}
