/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extras4;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        Cuenta cajero1 = new Cuenta(178245.23, "Jose Fernandez");
        System.out.println(cajero1.toString());
        System.out.println("------------------");
        System.out.println("¿Cuanto dinero va a sacar de su cuenta?");
        cajero1.sacarPlata(sc.nextDouble());
        System.out.println(cajero1.toString());

    }

}

