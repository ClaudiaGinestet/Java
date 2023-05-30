/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej2;
import java.util.Random;

/**
 *
 * @author Claudia
 */
class RevolverAgua {
    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random rand = new Random();
        posicionActual = rand.nextInt(6) + 1; // Generar un número aleatorio entre 1 y 6
        posicionAgua = rand.nextInt(6) + 1;
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        if (posicionActual == 6)
            posicionActual = 1;
        else
            posicionActual++;
    }

    @Override
    public String toString() {
        return "Posición actual: " + posicionActual + ", Posición del agua: " + posicionAgua;
    }
}
