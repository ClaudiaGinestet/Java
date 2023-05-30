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
public class Guia11ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Jugador> jugadores = new ArrayList<>();
        int numJugadores = 6; // Cambiar este valor según el número de jugadores deseado

        // Crear los jugadores
        for (int i = 1; i <= numJugadores; i++) {
            Jugador jugador = new Jugador(i);
            jugadores.add(jugador);
        }

        RevolverAgua revolver = new RevolverAgua();

        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
    }
}

