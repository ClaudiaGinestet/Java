/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejextra4;

import Servicios.PersonalServicio;
import Entidades.Profesor;
import Entidades.Estudiante;

/**
 *
 * @author Claudia
 */
public class Guia12ejextra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear objetos de ejemplo
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "1234567890", "Soltero", "Curso 1A");
        Profesor profesor = new Profesor("María", "López", "0987654321", "Casada", 2015, "Despacho 101", "Matemáticas");
        PersonalServicio personalServicio = new PersonalServicio("Pedro", "González", "5432167890", "Soltero", 2010, "Despacho 201", "Decanato");

        // Cambiar estado civil de una persona
        estudiante.cambiarEstadoCivil("Casado");
        profesor.cambiarEstadoCivil("Divorciado");
        personalServicio.cambiarEstadoCivil("Casado");

        // Reasignar despacho a un empleado
        profesor.reasignarDespacho("Despacho 102");
        personalServicio.reasignarDespacho("Despacho 202");

        // Matricular un estudiante en un nuevo curso
        estudiante.matricularEnCurso("Curso 2B");

        // Cambiar departamento de un profesor
        profesor.cambiarDepartamento("Lenguajes");

        // Cambiar sección de un empleado del personal de servicio
        personalServicio.cambiarSeccion("Secretaría");

        // Imprimir información de cada tipo de individuo
        estudiante.imprimirInformacion();
        System.out.println();
        profesor.imprimirInformacion();
        System.out.println();
        personalServicio.imprimirInformacion();
    }
}
    
