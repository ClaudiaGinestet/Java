/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12manos1;

import Entidades.Perro;
import Entidades.Animal;
import Entidades.Gato;
import java.util.ArrayList;

/**
 *
 * @author Claudia
 */
public class Guia12manos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        ArrayList<Animal> animales = new ArrayList<>();

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        animales.add(a);
        animales.add(b);
        animales.add(c);

        animales.forEach((animal) -> {
            System.out.println(animal.hacerRuido());
        });
    }
}
   
