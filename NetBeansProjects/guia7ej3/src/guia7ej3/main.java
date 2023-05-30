/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej3;

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
       
        Operacion operacion = new Operacion();
        Scanner scanner = new Scanner(System.in);

        // Crear operación
        operacion.crearOperacion();

        // Mostrar números ingresados
        System.out.println("Número 1: " + operacion.getNumero1());
        System.out.println("Número 2: " + operacion.getNumero2());

        // Sumar
        double resultadoSuma = operacion.sumar();
        System.out.println("La suma es: " + resultadoSuma);

        // Restar
        double resultadoResta = operacion.restar();
        System.out.println("La resta es: " + resultadoResta);

        // Multiplicar
        double resultadoMultiplicacion = operacion.multiplicar();
        if (resultadoMultiplicacion != 0) {
            System.out.println("La multiplicación es: " + resultadoMultiplicacion);
        }

        // Dividir
        double resultadoDivision = operacion.dividir();
        if (resultadoDivision != 0) {
            System.out.println("La división es: " + resultadoDivision);
        }
    }
}
    