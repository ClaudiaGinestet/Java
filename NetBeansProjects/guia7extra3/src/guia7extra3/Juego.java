/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Claudia
 */
class Juego {
      private int jugador1;
    private int jugador2;

    public void iniciar_juego() {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        

        int intentosRestantes = 10;
        boolean jugador2Gano = false;

        System.out.println("¡Bienvenidos al juego de adivinanza de números!");
        /*System.out.println("Jugador 1, elige un número entre 1 y 100:");*/
        System.out.println("El jugador 1 (la PC) cargara automaticamente un valor entre 1 y 100 para que adivines.");
           System.out.println("=================================================================");
        Random random = new Random();
        int numeroElegido = random.nextInt(100) + 1;
        /*int numeroElegido = scanner.nextInt();*/

        while (intentosRestantes > 0 && !jugador2Gano) {
            System.out.println("Vos (El Jugador 2), debes adivina el número (tienes " + intentosRestantes + " intentos restantes):");
            int numeroAdivinado = scanner.nextInt();

            if (numeroAdivinado == numeroElegido) {
                System.out.println("¡Felicitaciones, adivinaste el número!");
                jugador2Gano = true;
            } else if (numeroAdivinado < numeroElegido) {
                System.out.println("El número a adivinar es más alto");
            } else {
                System.out.println("El número a adivinar es más bajo");
            }

            intentosRestantes--;
        }

        if (jugador2Gano) {
            jugador2++;
        } else {
            System.out.println("Lo siento, te quedaste sin intentos. El número a adivinar era " + numeroElegido);
            jugador1++;
        }

        System.out.println("El número de intentos necesarios fue: " + (10 - intentosRestantes));
        System.out.println("Jugador 1 ha ganado " + jugador1 + " veces y Jugador 2 ha ganado " + jugador2 + " veces.");
    }
} 

