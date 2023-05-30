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
class Circunferencia {
   private double radio;

    // Constructor
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para crear una circunferencia
    public void crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia:");
        double rad = scanner.nextDouble();
        this.radio = rad;
    }

    // Método para calcular el área de la circunferencia
    public double area() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro de la circunferencia
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
} 
