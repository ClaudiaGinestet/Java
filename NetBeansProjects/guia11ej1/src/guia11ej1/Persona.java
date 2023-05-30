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
class Persona {
     private final String nombre;
    private final String apellido;
    private final int edad;
    private final int documento;
    private Perro perro;

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = null; // Inicialmente, la persona no tiene un perro asignado
    }

    public void adoptarPerro(Perro perro) {
        this.perro = perro;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + documento);

        if (perro != null) {
            System.out.println("Perro adoptado:");
            System.out.println("Nombre: " + perro.getNombre());
            System.out.println("Raza: " + perro.getRaza());
            System.out.println("Edad: " + perro.getEdad());
            System.out.println("Tamaño: " + perro.getTamaño());
        } else {
            System.out.println("No ha adoptado un perro aún.");
        }
    }
}


