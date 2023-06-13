/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ej2;

/**
 *
 * @author Claudia
 */
public class Guia12ej2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        System.out.println("Precio final de la lavadora: $" + lavadora.precioFinal());
        
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        System.out.println("Precio final del televisor: $" + televisor.precioFinal());
    }
}
