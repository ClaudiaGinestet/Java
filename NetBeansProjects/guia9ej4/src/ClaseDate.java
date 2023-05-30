
import Servicio.FechaServicio;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia
 */
public class ClaseDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fuck my life
        Date fechaNacimiento = (Date) FechaServicio.fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        Date fechaActual=(Date) FechaServicio.fechaActual();
        System.out.println("Fecha de hoy: " + fechaActual);
        int edad = FechaServicio.edad(fechaNacimiento, fechaActual);
        System.out.println("Su edad es: " + edad);
    }
    
}
