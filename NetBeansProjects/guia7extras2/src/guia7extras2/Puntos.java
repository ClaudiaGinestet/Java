/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extras2;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
class Puntos {
    private double x1, y1, x2, y2;
    
    public void crearPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto:");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.println("Ingrese las coordenadas del segundo punto:");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
    }
    
    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
    
    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
}

