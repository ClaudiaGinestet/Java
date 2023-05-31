/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extras2;

import java.util.Random;

/**
 *
 * @author Claudia
 * 
 */

   
class Cine {
    private Pelicula pelicula;
    private char[][] sala;
    private int filas;
    private int columnas;
    private double precioEntrada;

    //Para agregarle color a tu vida jajaj
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    public Cine(Pelicula pelicula, int filas, int columnas, double precioEntrada) {
        this.pelicula = pelicula;
        this.filas = filas;
        this.columnas = columnas;
        this.precioEntrada = precioEntrada;
        this.sala = new char[filas][columnas];
        limpiarSala();
    }

    private void limpiarSala() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sala[i][j] = ' ';
            }
        }
    }

    private boolean estaOcupado(int fila, int columna) {
        return sala[fila][columna] == 'X';
        
    }

    private boolean hayEspacioLibre() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (!estaOcupado(i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean cumpleEdad(Espectador espectador) {
        return espectador.getEdad() >= pelicula.getEdadMinima();
    }

    private boolean puedePagar(Espectador espectador) {
        return espectador.getCash() >= precioEntrada;
    }

    private void asignarAsiento(Espectador espectador) {
        Random rand = new Random();
        int fila = rand.nextInt(filas);
        int columna = rand.nextInt(columnas);

        while (estaOcupado(fila, columna)) {
            fila = rand.nextInt(filas);
            columna = rand.nextInt(columnas);
        }

        sala[fila][columna] = 'X';
    }

    public void agregarEspectador(Espectador espectador) {
        if (hayEspacioLibre() && cumpleEdad(espectador) && puedePagar(espectador)) {
            asignarAsiento(espectador);
            System.out.println("El espectador " + espectador.getNombre() + " se ha ubicado en un asiento.");
        } else {
            System.out.println("El espectador " + espectador.getNombre() + " no cumple los requisitos para ingresar al cine.");
        }
    }

    public void mostrarSala() {
        System.out.println("Estado de la sala:");

        for (int i = filas - 1; i >= 0; i--) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" "+i + 1 + " " + ANSI_YELLOW+(char) ('A' + j)+ANSI_RESET + " " + sala[i][j] + ANSI_RED+" | "+ANSI_RESET);
            }
            System.out.println();
        }
    }
}
