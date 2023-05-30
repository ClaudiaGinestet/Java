/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej3;

import java.util.ArrayList;

/**
 *
 * @author Claudia
 */
public class Guia11ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baraja baraja = new Baraja();
        baraja.barajar();
        System.out.println("Cartas disponibles: "+baraja.cartasDisponibles());
        System.out.println("======================================");
        Carta siguienteCarta = baraja.siguienteCarta();
        if (siguienteCarta !=null){
            System.out.println("Siguiente Carta: "+ siguienteCarta);
            System.out.println("======================================");
        }
    
    int cantidad = 5;
    ArrayList<Carta> mano = baraja.darCartas(cantidad);
    if (mano !=null){
        System.out.println("Se han repartido "+cantidad+" Cartas");
        mano.forEach((carta) -> {
            System.out.println(carta);
            });
        System.out.println("======================================");
    }
   baraja.cartasMonton();
   System.out.println("======================================");
   baraja.mostrarBaraja();
   System.out.println("======================================");
}
}
