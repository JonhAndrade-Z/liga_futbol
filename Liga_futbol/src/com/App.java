package com;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/** Clase principal de la aplicacion. */

public class App {
        public static void main(String[] args) throws Exception {

                /**
                 * fechas de nacimiento para cada jugador
                 */

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

                /**
                 * equipos con la ubicacion de los presidentes y
                 * entrenadores
                 */

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

                /**
                 * jugadores con la ubicacion dentro de un equipo
                 * y la anadicion de los jugadores a un equipo
                 */

                Jugadores jugador1 = new Jugadores("jonh_andrade", date1, "colombia", 17, Posicion.central);

                jugador1.setEquipo(equipo1);
                equipo1.anadirJugador(jugador1);

                Jugadores jugador2 = new Jugadores("javier_guerrero", date2, "espanya", 10, Posicion.medioCentro);

                jugador2.setEquipo(equipo1);
                equipo1.anadirJugador(jugador2);

                Jugadores jugador3 = new Jugadores("mael_zidane", date3, "francia", 1, Posicion.portero);

                jugador3.setEquipo(equipo1);
                equipo1.anadirJugador(jugador3);

                Jugadores jugador4 = new Jugadores("cristiano_ronaldo", date4, "portugal", 7, Posicion.delantero);

                jugador4.setEquipo(equipo1);
                equipo1.anadirJugador(jugador4);

                Jugadores jugador5 = new Jugadores("alex_sanz", date5, "espanya", 5, Posicion.lateral);

                jugador5.setEquipo(equipo2);
                equipo2.anadirJugador(jugador5);

                Jugadores jugador6 = new Jugadores("marco_polo", date6, "italia", 9, Posicion.medioCentro);

                jugador6.setEquipo(equipo2);
                equipo2.anadirJugador(jugador6);

                Jugadores jugador7 = new Jugadores("adolfo_reltih", date7, "alemania", 4, Posicion.delantero);

                jugador7.setEquipo(equipo2);
                equipo2.anadirJugador(jugador7);

                Jugadores jugador8 = new Jugadores("messi", date8, "espanya", 99, Posicion.lateral);

                jugador8.setEquipo(equipo3);
                equipo3.anadirJugador(jugador8);

                Jugadores jugador9 = new Jugadores("simon_unai", date9, "espanya", 77, Posicion.central);

                jugador9.setEquipo(equipo3);
                equipo3.anadirJugador(jugador9);

                Jugadores jugador10 = new Jugadores("dani_carbajal", date10, "espanya", 64, Posicion.portero);

                jugador10.setEquipo(equipo3);
                equipo3.anadirJugador(jugador10);

                /**
                 * almacena jugadores en el arrayList de jugadores
                 */

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

                /**
                 * trasnferencias de jugadores entre equipos
                 * con solicitudes de traspaso
                 * y confirmaciones de los presidentes
                 * y mas consultas
                 */

                jugador2.solicitarTraspaso();
                entrenador1.aprobarTraspaso(jugador2);
                // he cambiado el  entrenador traspaso por aprobarTraspaso
                // Esto no esta probado, no se ni sirve o funciona
                Presidente1.aprobarTraspaso(jugador2);
                   // he cambiado el  presidenteTraspaso  por aprobarTraspaso
                // Esto no esta probado, no se ni funciona bien

                System.out.println("El jugador " + jugador2.getNombre() + " pertenece al equipo: "
                                + jugador2.getEquipos().getNombre());

                equipo1.realizarTraspaso(jugador2, equipo3);

                System.out.println("El jugador " + jugador2.getNombre() + " pertenece al equipo: "
                                + jugador2.getEquipos().getNombre());
                equipo1.realizarTraspaso(jugador2, equipo2);

                jugador4.solicitarTraspaso();
                entrenador1.aprobarTraspaso(jugador4);
                // he cambiado el  entrenador traspaso por aprobarTraspaso
                // Esto no esta probado, no se si funciona bien
                Presidente2.rechazarTraspaso(jugador4);
                 // he cambiado el  presidenteTraspaso  por rechazarTraspaso
                // Esto no esta probado, no se si funciona bien
                equipo3.realizarTraspaso(jugador4, equipo2);

                System.out.println("Total de jugadores: " + Jugadores.getContadorJugadores());
                System.out.println("Total de entrenadores: " + Entrenadores.getContadorEntrenadores());
                System.out.println("Total de presidentes: " + Presidentes.getContadorPresidentes());
                System.out.println("Total de equipos: " + Equipos.getContadorEquipos());
                System.out.println("Número de jugadores en equipo1: " + equipo1.getJugadores().size());
                System.out.println("Número de jugadores en equipo2: " + equipo2.getJugadores().size());
                System.out.println("Número de jugadores en equipo3: " + equipo3.getJugadores().size());
        }

}
