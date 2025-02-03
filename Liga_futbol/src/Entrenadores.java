
public class Entrenadores {

    public String nombre;
    public formacion formacionPreferida;

    public Entrenadores(String nombre, formacion formacionPreferida) {
        this.nombre = nombre;
        this.formacionPreferida = formacionPreferida;
<<<<<<< HEAD
        System.out.println("Estamos dentro del constructor de Entrenadores");
    }

    public void setEquipo(Equipos equipo) {

    }

    public void getEquipo(Equipos equipo) {

    }

=======
        // System.out.println("estamos en entrenadores");
    }

    public void setEquipo(Equipos equipos){

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
    
    
    
>>>>>>> 1b9848279c35a77837861312188879657be77a03
}
