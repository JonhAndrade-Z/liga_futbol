import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class App {
        public static void main(String[] args) throws Exception {

                // fechas de nacimiento

                Calendar cal = Calendar.getInstance();

                cal.set(2000, 1, 18);
                Date date1 = cal.getTime();

                cal.set(1980, 3, 1);
                Date date2 = cal.getTime();

                cal.set(1995, 7, 4);
                Date date3 = cal.getTime();

                cal.set(1996, 12, 30);
                Date date4 = cal.getTime();

                cal.set(1996, 10, 27);
                Date date5 = cal.getTime();

                cal.set(1999, 1, 20);
                Date date6 = cal.getTime();

                cal.set(1998, 6, 8);
                Date date7 = cal.getTime();
                cal.set(1989, 4, 28);
                Date date8 = cal.getTime();

                cal.set(1998, 5, 19);
                Date date9 = cal.getTime();

                cal.set(1996, 11, 14);
                Date date10 = cal.getTime();

                Equipos equipo1 = new Equipos("valencia", "vlc");
                Equipos equipo2 = new Equipos("madrid", "rmd");
                Equipos equipo3 = new Equipos("barcelona", "bcl");

                // System.out.println(String.toString(equipo1));

                Presidentes Presidente1 = new Presidentes("florentino_perez", "79000000A");
                Presidentes Presidente2 = new Presidentes("ramiro_fernandez", "78765411X");
                Presidentes Presidente3 = new Presidentes("estefano_clase", "77777777J");

                System.out.println(Presidente1);

                Entrenadores entrenador1 = new Entrenadores("paco_perez", formacion._433);
                Entrenadores entrenador2 = new Entrenadores("mike_litoris", formacion._442);
                Entrenadores entrenador3 = new Entrenadores("lorenzo_garcia", formacion._523);

                System.out.println(entrenador1);

                Presidente1.setEquipo(equipo1);
                equipo1.setPresidentes(Presidente1);

                Presidente2.setEquipo(equipo2);
                equipo2.setPresidentes(Presidente2);

                Presidente3.setEquipo(equipo3);
                equipo3.setPresidentes(Presidente3);

                entrenador1.setEquipo(equipo1);
                equipo1.setEntrenadores(entrenador1);

                entrenador2.setEquipo(equipo2);
                equipo2.setEntrenadores(entrenador2);

                entrenador3.setEquipo(equipo3);
                equipo3.setEntrenadores(entrenador3);

                //

                Jugadores jugador1 = new Jugadores("jonh_andrade", date1, "colombia", 17, Posicion.central);

                jugador1.setEquipo(equipo1);
                equipo1.anadirJugador(jugador1);

                Jugadores jugador2 = new Jugadores("javier_guerrero", date2, "espanya", 10, Posicion.medioCentro);

                jugador2.setEquipo(equipo2);
                equipo2.anadirJugador(jugador2);

                Jugadores jugador3 = new Jugadores("mael_zidane", date3, "francia", 1, Posicion.portero);

                jugador3.setEquipo(equipo3);
                equipo3.anadirJugador(jugador3);

                Jugadores jugador4 = new Jugadores("cristiano_ronaldo", date4, "portugal", 7, Posicion.delantero);

                jugador4.setEquipo(equipo1);
                equipo1.anadirJugador(jugador4);

                Jugadores jugador5 = new Jugadores("alex_sanz", date5, "espanya", 5, Posicion.lateral);

                jugador5.setEquipo(equipo2);
                equipo2.anadirJugador(jugador5);

                Jugadores jugador6 = new Jugadores("marco_polo", date6, "italia", 9, Posicion.medioCentro);

                jugador6.setEquipo(equipo3);
                equipo3.anadirJugador(jugador6);

                Jugadores jugador7 = new Jugadores("adolfo_reltih", date7, "alemania", 4, Posicion.delantero);

                jugador7.setEquipo(equipo1);
                equipo1.anadirJugador(jugador7);

                Jugadores jugador8 = new Jugadores("messi", date8, "espanya", 99, Posicion.lateral);

                jugador8.setEquipo(equipo2);
                equipo2.anadirJugador(jugador8);

                Jugadores jugador9 = new Jugadores("simon_unai", date9, "espanya", 77, Posicion.central);

                jugador9.setEquipo(equipo3);
                equipo3.anadirJugador(jugador9);

                Jugadores jugador10 = new Jugadores("dani_carbajal", date10, "espanya", 64, Posicion.portero);

                jugador10.setEquipo(equipo1);
                equipo1.anadirJugador(jugador10);

                // añadir un equipo a cada jugador

                // el arraylist de jugadores

                ArrayList<Jugadores> jugadoress = new ArrayList<Jugadores>();

                jugadoress.add(jugador1);
                jugadoress.add(jugador2);
                jugadoress.add(jugador3);
                jugadoress.add(jugador4);

                ArrayList<Jugadores> jugadoress2 = new ArrayList<Jugadores>();

                jugadoress2.add(jugador5);
                jugadoress2.add(jugador6);
                jugadoress2.add(jugador7);

                ArrayList<Jugadores> jugadoress3 = new ArrayList<Jugadores>();

                jugadoress3.add(jugador8);
                jugadoress3.add(jugador9);
                jugadoress3.add(jugador10);

                equipo1.setJugadores(jugadoress);
                equipo2.setJugadores(jugadoress2);
                equipo3.setJugadores(jugadoress3);

                jugador1.solicitarTraspaso();
                entrenador1.entrenadorTraspaso(jugador1);
                Presidente1.presidenteTraspaso(jugador1);


                System.out.println(jugador1.getNombre() + ":" + jugador1.getEquipos().getNombre());

                jugador1.solicitarTraspaso();
                entrenador2.entrenadorTraspaso(jugador1);
                Presidente2.presidenteTraspaso(jugador1);

                equipo1.seRealizaElTraspasoDelJugador(jugador1, equipo2);


                System.out.println(jugador1.getNombre() + ":" + jugador1.getEquipos().getNombre());

        }

}
