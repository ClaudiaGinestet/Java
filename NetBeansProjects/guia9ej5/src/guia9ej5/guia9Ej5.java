/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un 
nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor 
parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, 
con los siguientes métodos:
   Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la 
persona a crear. Retornar el objeto Persona creado.
   Método calcularEdad que calcule la edad del usuario utilizando el atributo de 
fecha de nacimiento y la fecha actual.
   Método menorQue recibe como parámetro una Persona y una edad. Retorna true si 
la persona es menor que la edad consultada o false en caso contrario.
   Método mostrarPersona que muestra la información de la persona deseada.

 */
package guia9ej5;

import Entidades.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Claudia
 */
public class guia9Ej5 {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();

        // Crear una persona
        Persona persona = personaService.crearPersona();

        // Calcular la edad de la persona
        int edad = personaService.calcularEdad(persona);

        // Verificar si la persona es menor que una edad específica
        int edadLimite = 18;
        boolean esMenor = personaService.menorQue(persona, edadLimite);

        // Mostrar los datos de la persona
        personaService.mostrarPersona(persona);

        // Mostrar si la persona es menor que una edad específica
        if (esMenor) {
            System.out.println(persona.getNombre() + " es un crio = ilegal.");
        } else {
            System.out.println(persona.getNombre() + " es un geronte = legal pero asqueroso.");
        }
    }
}