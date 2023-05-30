
import static java.time.Clock.system;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         

        System.out.println("Ingrese una palabra");
        Scanner leer = new Scanner(System.in);
        String palabra = null;
        
        String Scanner = leer.next(palabra);

        switch (palabra) {
            case "a":
                System.out.println("@");
                break;
            case "e":
                System.out.println("#");
                break;
            case "i":
                System.out.println("$");
                break;
            case "o":
                System.out.println("%");
                break;
            case "u":
                System.out.println("*");
                break;
            default:
                System.out.println(" ");
      
        
                
    }
    
}
