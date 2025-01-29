import java.util.Calendar;
import java.util.Date;

public class App {
        public static void main(String[] args) throws Exception {
                Calendar cal = Calendar.getInstance();

                cal.set(1996, 10, 18);
                Date date1 = cal.getTime();

                cal.set(1996, 10, 19);
                Date date2 = cal.getTime();

                cal.set(1996, 10, 18);
                Date date3 = cal.getTime();

                cal.set(1996, 10, 18);
                Date date4 = cal.getTime();

                cal.set(1996, 10, 18);
                Date date5 = cal.getTime();

                cal.set(1996, 10, 18);
                Date date6 = cal.getTime();

                cal.set(1996, 10, 18);
                Date date7 = cal.getTime();
                cal.set(1996, 10, 18);
                Date date8 = cal.getTime();

                cal.set(1996, 10, 18);
                Date date9 = cal.getTime();

                cal.set(1996, 10, 18);
                Date date10 = cal.getTime();

                Jugadores jugador1 = new Jugadores("jonh_andrade", date1, "colombia", 17, Posicion.central,
                                Traspaso.SIN_SOLICITAR);

                Jugadores jugador2 = new Jugadores("javier_guerrero", date2, "espanya", 10, Posicion.medioCentro,
                                Traspaso.SIN_SOLICITAR);

                Jugadores jugador3 = new Jugadores("mael_zidane", date3, "francia", 1, Posicion.portero,
                                Traspaso.SIN_SOLICITAR);

                Jugadores jugador4 = new Jugadores("cristiano_ronaldo", date4, "portugal", 7, Posicion.delantero,
                                Traspaso.SIN_SOLICITAR);
                Jugadores jugador5 = new Jugadores("alex_sanz", date5, "espanya", 5, Posicion.lateral,
                                Traspaso.SIN_SOLICITAR);

                Jugadores jugador6 = new Jugadores("marco_polo", date6, "italia", 9, Posicion.medioCentro,
                                Traspaso.SIN_SOLICITAR);

                Jugadores jugador7 = new Jugadores("adolfo_reltih", date7, "alemania", 4, Posicion.delantero,
                                Traspaso.SIN_SOLICITAR);

                Jugadores jugador8 = new Jugadores("messi", date8, "espanya", 99, Posicion.lateral,
                                Traspaso.SIN_SOLICITAR);

                Jugadores jugador9 = new Jugadores("simon_unai", date9, "espanya", 77, Posicion.central,
                                Traspaso.SIN_SOLICITAR);

                Jugadores jugador10 = new Jugadores("dani_carbajal", date10, "espanya", 64, Posicion.portero,
                                Traspaso.SIN_SOLICITAR);

                Equipos equipo1 = new Equipos("valencia", "vlc");
                Equipos equipo2 = new Equipos("madrid", "rmd");
                Equipos equipo3 = new Equipos("barcelona", "bcl");

                Presidentes Presidente1 = new Presidentes("florentino_perez", "79000000A");
                Presidentes Presidente2 = new Presidentes("ramiro_fernandez", "78765411X");
                Presidentes Presidente3 = new Presidentes("estefano_clase", "77777777J");

                Entrenadores entrenador1 = new Entrenadores("paco_perez", formacion._433);
                Entrenadores entrenador2 = new Entrenadores("mike_litoris", formacion._442);
                Entrenadores entrenador3 = new Entrenadores("lorenzo_garcia", formacion._523);

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


        }
}
