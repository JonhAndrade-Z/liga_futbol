import java.util.Date;

public class Jugadores {

    private String nombre;
    private Date fechaNacimiento;
    private String paisOrigen;
    private int dorsal;
    private Posicion posicion;
    private Traspaso traspaso;
    private Equipos equipos;

    public Jugadores(String nombre, Date fechaNacimiento, String paisOrigen, int dorsal, Posicion posicion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.traspaso = Traspaso.SIN_SOLICITAR;

        // System.out.println("estamos dentro del constructor de jugadores");
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEquipo(Equipos equipos) {
        this.equipos = equipos;
    }

    public String toString() {
        return "Jugadores [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", paisOrigen=" + paisOrigen
                + ", dorsal=" + dorsal + ", posicion=" + posicion + ", traspaso=" + traspaso + ", equipos=" + equipos
                + "]";
    }

    

}
