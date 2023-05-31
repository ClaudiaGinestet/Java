/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extras2;

/**
 *
 * @author Claudia
 */

   // Clase Espectador
class Espectador {
    private String nombre;
    private int edad;
    private double cash;

    public Espectador(String nombre, int edad, double cash) {
        this.nombre = nombre;
        this.edad = edad;
        this.cash = cash;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getCash() {
        return cash;
    }
} 

