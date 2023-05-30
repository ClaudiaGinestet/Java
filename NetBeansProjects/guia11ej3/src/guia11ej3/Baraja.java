/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Claudia
 */
class Baraja {
     private final ArrayList<Carta> cartas;
    private final ArrayList<Carta> monton;
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
public static final String ANSI_RESET = "\u001B[0m";
    public Baraja() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();

        String[] palos = {ANSI_BLUE+"Espadas"+ANSI_RESET,ANSI_GREEN+"Bastos"+ANSI_RESET,ANSI_YELLOW+ "Oros"+ANSI_RESET, ANSI_CYAN +"Copas"+ANSI_RESET};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    Carta carta = new Carta(numero, palo);
                    cartas.add(carta);
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }

        Carta carta = cartas.remove(0);
        monton.add(carta);
        return carta;
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public ArrayList<Carta> darCartas(int cantidad) {
        if (cantidad > cartasDisponibles()) {
            System.out.println("No hay suficientes cartas disponibles.");
            return null;
        }

        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta carta = siguienteCarta();
            if (carta != null) {
                mano.add(carta);
            }
        }

        return mano;
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta todavía.");
            return;
        }

        System.out.println("Cartas en el montón:");
        monton.forEach((carta) -> {
            System.out.println(carta);
         });
    }

    public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("No hay cartas en la baraja.");
            return;
        }

        System.out.println("Cartas en la baraja:");
        cartas.forEach((carta) -> {
            System.out.println(carta);
         });
    }
}

