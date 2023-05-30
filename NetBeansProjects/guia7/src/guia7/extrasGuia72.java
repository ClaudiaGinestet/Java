/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

/**
 *
 * @author Claudia
 */
public class extrasGuia72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
       Punto puntos = new Punto();
        
        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los dos puntos es: " + distancia);

    }

}
        
