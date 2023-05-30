/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

/**
 *
 * @author Claudia
 */

import java.util.Scanner;
import Entidades.Cafetera;
import Servicios.CafeteraServicio;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Creamos una cafetera con capacidad máxima de 500 ml y cantidad actual de 0 ml
        Cafetera cafetera = new Cafetera(1000, 0);
        
        // Creamos una instancia del servicio de cafetera
        CafeteraServicio servicio = new CafeteraServicio();
        
        int opcion;
        
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    servicio.llenarCafetera(cafetera);
                    System.out.println("Cafetera llenada.");
                    break;
                case 2:
                    System.out.print("Ingrese el tamaño de la taza (en ml): ");
                    int tamanoTaza = scanner.nextInt();
                    servicio.servirTaza(cafetera, tamanoTaza);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafetera);
                    System.out.println("Cafetera vaciada.");
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de café (en ml): ");
                    int cantidadCafe = scanner.nextInt();
                    servicio.agregarCafe(cafetera, cantidadCafe);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
            
            System.out.println("Cantidad actual de café en la cafetera: " + cafetera.getCantidadActual() + " ml");
            
        } while(opcion != 5);
        
        scanner.close();
    }
}

                