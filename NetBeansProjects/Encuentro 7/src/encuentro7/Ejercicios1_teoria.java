/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro7;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejercicios1_teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = read.nextLine().toLowerCase();
        System.out.println(frase);
        System.out.println(codificacion(frase));
    }

    public static String codificacion(String texto) {
        String salida = "";
        String letra;
        for (int i = 0; i < texto.length(); i++) {
            letra = texto.substring(i, i + 1);
            switch (letra) {
                case "a":
                    salida = salida + "@";
                    break;
                case "e":
                    salida = salida + "#";
                    break;
                case "i":
                    salida = salida + "$";
                    break;
                case "o":
                    salida = salida + "%";
                    break;
                case "u":
                    salida = salida + "*";
                    break;
                default:
                    salida = salida + letra;
            }
        }
        return salida;
    }
}
