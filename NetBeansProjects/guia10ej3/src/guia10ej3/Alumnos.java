/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej3;

import Servicios.ServicioAlumno;
import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioAlumno servicio = new ServicioAlumno();
        Scanner leer = new Scanner(System.in);
        //String respuesta;
        /*do {
            System.out.println("¿Quiere agregar un nuevo alumno? (S/N): ");
            respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("S")) {
                servicio.agregarAlumno();
                servicio.notaFinal();
                break;
            }
        } while (respuesta.equalsIgnoreCase("N"));
        System.out.println("Gracias, vuelva pronto.");
    }
}  */     
        
        while(true){
            System.out.println("¿Quiere agrerar un nuevo alumno? (S/N): ");
            String respuesta = leer.nextLine();
            
            if (respuesta.equalsIgnoreCase("N")){
                System.out.println("Gracias vuelva pronto.");
                leer.nextLine();
                break;
            }
            servicio.agregarAlumno();
           
        }
        servicio.notaFinal(); 
    }
    
}
