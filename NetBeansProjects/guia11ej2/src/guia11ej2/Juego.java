/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej2;

import java.util.ArrayList;

/**
 *
 * @author Claudia
 */
class Juego {
      private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        this.jugadores = jugadores;
        this.revolver = r;
        revolver.llenarRevolver();
    }

    public void ronda() {
        int numJugadores = jugadores.size();
        int jugadorActual = 0;

        while (true) {
            Jugador jugador = jugadores.get(jugadorActual);
            boolean mojado = jugador.disparo(revolver);

            if (mojado) {
                System.out.println("¡El juego ha terminado! " + jugador + " se ha mojado.");
                break;
            }

            jugadorActual = (jugadorActual + 1) % numJugadores; // Pasar al siguiente jugador
        }
    }
}

