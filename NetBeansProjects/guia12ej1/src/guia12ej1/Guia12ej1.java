/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ej1;

import Entidades.Perro;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Animal;

/**
 *
 * @author Claudia
 */
public class Guia12ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LPM... que estoy haciendo con mi vida... ja
        Animal perro1 = new Perro("Stich","Carne", 15,"Doberman");
        perro1.Alimentarse();
        Animal perro2 = new Perro("Teddy","Croquetas", 10,"Chihuahua");
        perro2.Alimentarse();
        Animal gato1 = new Gato("Pelusa","Galletas", 15,"Siames");
        gato1.Alimentarse();
        Animal caballo1 = new Caballo("Spark","Pasto", 25,"Fino");
        caballo1.Alimentarse();
    }
    
}
