/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej1;

/**
 *
 * @author Claudia
 */
public class Guia11ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Perro perro1 = new Perro("Bobby", "Labrador", 3, "Mediano");
        Perro perro2 = new Perro("Luna", "Poodle", 2, "Pequeño");

        Persona persona1 = new Persona("Juan", "Perez", 30, 123456);
        Persona persona2 = new Persona("María", "Gomez", 25, 987654);

        persona1.adoptarPerro(perro1);
        persona2.adoptarPerro(perro2);

        persona1.mostrarInformacion();
        System.out.println("--------------");
        persona2.mostrarInformacion();
    }
}

   