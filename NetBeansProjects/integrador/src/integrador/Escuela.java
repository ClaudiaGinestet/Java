/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Claudia
 */

public class Escuela {
    private Estudiante[] estudiantes;

    public Escuela() {
        estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Juan", 8.5);
        estudiantes[1] = new Estudiante("María", 9.0);
        estudiantes[2] = new Estudiante("Pedro", 6.5);
        estudiantes[3] = new Estudiante("Laura", 7.0);
        estudiantes[4] = new Estudiante("Sofía", 8.0);
        estudiantes[5] = new Estudiante("Andrés", 9.5);
        estudiantes[6] = new Estudiante("Lucía", 7.5);
        estudiantes[7] = new Estudiante("Claudia", 8.0);
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getNota();
        }
        return suma / estudiantes.length;
    }

    public String[] obtenerNombresArribaDelPromedio() {
        double promedio = calcularPromedio();
        List<String> nombres = new ArrayList<String>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombres.add(estudiante.getNombre());
            }
        }
        return nombres.toArray(new String[nombres.size()]);
    }

    public void mostrarArribaDelPromedio() {
        double promedio = calcularPromedio();
        System.out.println("Alumnos con nota arriba del promedio (" + promedio + "):");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante.getNombre() + ": " + estudiante.getNota());
            }
        }
    }
}
 

