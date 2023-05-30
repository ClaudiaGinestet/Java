/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class ServicioAlumno {
    private final ArrayList<Alumno> listaAlumnos;
    private final Scanner leer;
    
    public ServicioAlumno(){
        listaAlumnos =new ArrayList<Alumno>();
        leer = new Scanner(System.in);
        
    }
    public void agregarAlumno(){
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = leer.nextLine();
        ArrayList<Integer> notas = new ArrayList<Integer>();
        for (int i=1; i<=3; i++){
            System.out.println("Ingrese la nota "+ i + " del alumno:");
            int nota = leer.nextInt();
            leer.nextLine(); // esto es para hacer evitar que se saltee la linea
            notas.add(nota);    
        }
        Alumno alumno = new Alumno(nombre,notas);
        listaAlumnos.add(alumno);
        System.out.println("Las notas fueron cargadas correctamente al alumno");
    }
    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombre = leer.nextLine();
         
        for (Alumno alumno : listaAlumnos){
            if (alumno.getNombre().equalsIgnoreCase(nombre)){
                double notaFinal = alumno.notaFinal();
                System.out.println("La nota final de "+nombre+ " es: "+notaFinal);
                return;
            }
        }
        System.out.println("No encontró al alumno "+ nombre +" en la lista de alumnos.");
    }
}
