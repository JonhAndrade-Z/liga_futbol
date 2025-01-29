public class Equipos {

    public String nombre;
    public String abreviatura;
    private Presidentes presidentes;
    private Entrenadores entrenadores;

    public Equipos(String nombre, String abreviatura) {

        this.nombre = nombre;
        System.out.println("estamos en equipos");

    }

    public void setPresidentes(Presidentes presidentes) {
        this.presidentes = presidentes;
    }

    public void setEntrenadores(Entrenadores entrenadores){
        this.entrenadores = entrenadores;
    }

   
}
