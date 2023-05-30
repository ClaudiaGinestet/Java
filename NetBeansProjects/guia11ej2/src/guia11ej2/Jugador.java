/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej2;

/**
 *
 * @author Claudia
 */
class Jugador {
    private final int id;
    private final String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(RevolverAgua r) {
        System.out.println(nombre + " se apunta con el revólver de agua.");
        if (r.mojar()) {
            mojado = true;
            System.out.println(nombre + " se moja.");
            return true;
        } else {
            r.siguienteChorro();
            System.out.println("¡El agua no salió! " + nombre + " pasa el revólver al siguiente jugador.");
            return false;
        }
    }

    public boolean estaMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

