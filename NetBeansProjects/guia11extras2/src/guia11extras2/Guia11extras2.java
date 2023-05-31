/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extras2;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class Guia11extras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // (recordatorio para el futuro: no seas vaga y hace que se ingrese por consola a los espectadores.
        // Crear una película
        Pelicula pelicula = new Pelicula("La película", 120, 12, "Director");

        // Crear el cine
        Cine cine = new Cine(pelicula, 4, 3, 10.0);

        Scanner scanner = new Scanner(System.in);

        // Ingresar cantidad de espectadores
        System.out.print("Ingrese la cantidad de espectadores: ");
        int cantidadEspectadores = scanner.nextInt();
        scanner.nextLine(); // salto de línea 

        // Ingresar datos de los espectadores
        for (int i = 0; i < cantidadEspectadores; i++) {
            System.out.println("\n--- Ingresando datos del espectador " + (i + 1) + " ---");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Dinero disponible: ");
            double dinero = scanner.nextDouble();
            scanner.nextLine(); 

            Espectador espectador = new Espectador(nombre, edad, dinero);
            cine.agregarEspectador(espectador);
        }

        scanner.close();

        // Mostrar la sala
        cine.mostrarSala();
    }
}