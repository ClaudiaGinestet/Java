/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class Guia10ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> razasDePerros = new ArrayList<>();
    	Scanner scanner = new Scanner(System.in);
    	while (true) {
        	System.out.print("Introduce una raza de perro o escribe 'salir' para terminar: ");
  	      String razaDePerro = scanner.nextLine();
              
        	if (razaDePerro.equalsIgnoreCase("salir")) {
            	break;
        	}
        	razasDePerros.add(razaDePerro);
    	}
    	System.out.println("\nRazas de perros guardadas:");
    	for (String razaDePerro : razasDePerros) {
        	System.out.println(razaDePerro);
                System.out.println("=====================================================");
    	}
	}
}


