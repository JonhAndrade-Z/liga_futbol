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

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Traspaso getTraspaso() {
        return traspaso;
    }

    public void setTraspaso(Traspaso traspaso) {
        this.traspaso = traspaso;
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public void solicitarTraspaso() {
        if (traspaso == traspaso.SIN_SOLICITAR) {
            traspaso = traspaso.SOLICITADO;
            System.out.println("El jugador " + nombre + " ha solicitado el traspaso");
        } else {
            System.out.println("El jugador " + nombre + " ya ha solicitado el traspaso");
        }
    }

    // public void traspasoAprobado() {
    //     if (traspaso == traspaso.APROBADO_POR_PRESIDENTE) {
            
    //         System.out.println("El traspaso de " + nombre + " ha sido aprobado por el entrenador");
    //     } else {
    //         System.out.println("El traspaso de " + nombre + " no ha sido aprobado por el entrenador");

    //     }
    // }

}
