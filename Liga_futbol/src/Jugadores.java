import java.util.Calendar;

public class Jugadores {

    private String nombre;
    // private Date fechaNacimiento;
    private String paisOrigen;


    private int dorsal;
    
    public Jugadores(String nombre, String paisOrigen, int dorsal) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal <= 0) {
            System.out.println("el dorsal no puede es correcto");
        }

        this.dorsal = dorsal;
    }

}
