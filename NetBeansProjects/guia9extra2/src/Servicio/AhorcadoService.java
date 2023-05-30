/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Claudia
 */

   public class AhorcadoService {
    private Ahorcado ahorcado;
    private Scanner scanner;

    public void crearJuego() {
        scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra a buscar:");
        String palabra = scanner.nextLine();
        System.out.println("Ingrese la cantidad máxima de intentos:");
        int intentosMaximos = scanner.nextInt();
        ahorcado = new Ahorcado(palabra.toCharArray(), intentosMaximos);
    }

    public void longitud() {
        System.out.println("La longitud de la palabra es: " + ahorcado.getLongitud());
    }

    public boolean buscar(char letra) {
        ahorcado.buscarLetra(letra);
        return ahorcado.todasLetrasEncontradas();
    }

    public boolean encontradas(char letra) {
        ahorcado.buscarLetra(letra);
        ahorcado.mostrarEstado();
        return ahorcado.todasLetrasEncontradas();
    }

    public int intentos() {
        return ahorcado.getIntentosRestantes();
    }

    public void juego() {
        crearJuego();
        scanner.nextLine(); // Limpiamos el buffer del scanner
        while (ahorcado.getIntentosRestantes() > 0 && !ahorcado.todasLetrasEncontradas()) {
            System.out.println("Ingrese una letra:");
            String letraIngresada = scanner.nextLine();
            char letra = letraIngresada.charAt(0);
            if (buscar(letra)) {
                System.out.println("¡Ganaste!");
                return;
            } else {
                encontradas(letra);
            }
        }
    }
   }
    
