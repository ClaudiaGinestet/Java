/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej4;

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

        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        System.out.println("================================================="); 
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo(base, altura);

        System.out.println("Superficie: " + rectangulo.calcularSuperficie());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("================================================="); 
        System.out.println("Rectángulo dibujado con asteriscos:");
        rectangulo.dibujarRectangulo();
    }
}
    
