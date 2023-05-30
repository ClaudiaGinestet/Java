/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extras6;

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
         // Creación de un objeto Rectangulo con lados de 4 y 6
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        
        // Impresión del área del rectángulo utilizando el método calcular_area
        System.out.println("El área del rectángulo es: " + rectangulo1.calcular_area());
    }
}
    