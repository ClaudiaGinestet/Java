/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */

public class PersonaService {

    public static Persona crearPersona() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el nombre de la persona: ");
    String nombre = sc.nextLine();
    System.out.println("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
    String fechaNacimientoString = sc.nextLine();
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    Date fechaNacimiento = null;
    try {
        fechaNacimiento = format.parse(fechaNacimientoString);
    } catch (Exception e) {
        e.printStackTrace();
    }
    Persona persona = new Persona(nombre, fechaNacimiento);
    return persona;
}

    public int calcularEdad(Persona persona) {
        LocalDate fechaNacimiento = new java.sql.Date(persona.getFechaNacimiento().getTime()).toLocalDate();
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, ahora);
        return periodo.getYears();
    }

    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calcularEdad(persona);
        return edadPersona < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(persona));
    }
}