/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidades.Cafetera;

/**
 *
 * @author Claudia
 */

public class CafeteraServicio {
    
    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera ha sido llenada.");
    }
    
    public void servirTaza(Cafetera cafetera, int tamanoTaza) {
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
            System.out.println("Se ha llenado la taza.");
        } else {
            System.out.println("No se pudo llenar la taza. Quedó con " + cafetera.getCantidadActual() + " ml de café.");
            cafetera.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada.");
    }
    
    public void agregarCafe(Cafetera cafetera, int cantidadCafe) {
        int cantidadActual = cafetera.getCantidadActual();
        if (cantidadActual + cantidadCafe <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cantidadActual + cantidadCafe);
            System.out.println("Se han agregado " + cantidadCafe + " ml de café a la cafetera.");
        } else {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("La cafetera está llena. No se puede agregar más café.");
        }
    }
}
