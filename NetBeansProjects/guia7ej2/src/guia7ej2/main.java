/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej2;

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
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia:");
        double radio = scanner.nextDouble();

        Circunferencia circunferencia = new Circunferencia(radio);

        System.out.println("Radio: " + circunferencia.getRadio());
        System.out.println("Area: " + circunferencia.area());
        System.out.println("Perimetro: " + circunferencia.perimetro());

        circunferencia.setRadio(10.0);
        System.out.println("Radio: " + circunferencia.getRadio());
        System.out.println("Area: " + circunferencia.area());
        System.out.println("Perimetro: " + circunferencia.perimetro());

        circunferencia.crearCircunferencia();
        System.out.println("Radio: " + circunferencia.getRadio());
        System.out.println("Area: " + circunferencia.area());
        System.out.println("Perimetro: " + circunferencia.perimetro());
    }
}