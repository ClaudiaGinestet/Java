/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Claudia
 */
public class Ahorcado {
    private char[] palabra;
    private boolean[] letrasEncontradas;
    private int intentosMaximos;
    private int intentosRestantes;

    public Ahorcado(char[] palabra, int intentosMaximos) {
        this.palabra = palabra;
        this.letrasEncontradas = new boolean[palabra.length];
        this.intentosMaximos = intentosMaximos;
        this.intentosRestantes = intentosMaximos;
    }

    public void buscarLetra(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                letrasEncontradas[i] = true;
                encontrada = true;
            }
        }
        if (!encontrada) {
            intentosRestantes--;
        }
    }

    public boolean todasLetrasEncontradas() {
        for (boolean encontrada : letrasEncontradas) {
            if (!encontrada) {
                return false;
            }
        }
        return true;
    }

    public int getIntentosRestantes() {
        return intentosRestantes=intentosRestantes-1;
    }

    public void mostrarEstado() {
        System.out.print("Palabra: ");
        for (int i = 0; i < palabra.length; i++) {
            if (letrasEncontradas[i]) {
                System.out.print(palabra[i] + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
        System.out.println("Intentos restantes: " + intentosRestantes);
    }

    public int getLongitud() {
        return palabra.length;
    }
}

