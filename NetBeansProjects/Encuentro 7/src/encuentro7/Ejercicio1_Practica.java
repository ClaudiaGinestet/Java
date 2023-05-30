/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro7;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class Ejercicio1_Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int num1, num2, opcion;
        System.out.println("Ingrse 2 numeros");
        num1=read.nextInt(); num2=read.nextInt();
        System.out.println("-----------------------");
        System.out.println("        Menu:          ");
        System.out.println("1. Suma                ");
        System.out.println("2. Resta               ");
        System.out.println("3. Multiplicacion      ");
        System.out.println("4. Division            ");
        System.out.println("-----------------------");
        opcion=read.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("SUMA " + suma(num1, num2));
                break;
            case 2:
                System.out.println("RESTA " + resta(num1, num2));
                break;
            case 3:
                System.out.println("MULTIPLICACION " + multi(num1, num2));
                break;
            case 4:
                System.out.println("DIVISION " + div(num1, num2));
                break;
            default:
                System.out.println("Valor Invalido");
        }
    }
    public static int suma(int n1, int n2) {
        int result;
        result= n1 + n2;
        return result;
    }
    public static int resta(int n1, int n2) {
        int result;
        result= n1 - n2;
        return result;
    }
    public static int multi(int n1, int n2) {
        int result;
        result= n1 * n2;
        return result;
    }
     public static double div(int n1, int n2) {
        double result;
        result= n1 / n2;
        return result;
    }
}
