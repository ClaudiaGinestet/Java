
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
public class ejer3 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        double euro;
        String opcion;
        System.out.println("Ingrese la cantidad de Euros que desea convertir");
        euro=read.nextDouble();
        System.out.println("Elija el tipo de cambio: ");
        System.out.println("Dolar // Yen // Libras");
        opcion=read.next();
        
        System.out.println(convertidor(euro, opcion));
    }
    public static String convertidor(double euro, String moneda) {
        double salida, libras=0.86, yenes=129.852, dolar=1.28611;
        switch (moneda) {
            case "Dolar":
                System.out.println("Euro a Dolar: " + euro*dolar);
                break;
            case "Yen":
                System.out.println("Euro a Yenes: " + euro*yenes);
                break;
            case "Libras":
                System.out.println("Euro a Libras: " + euro*libras);
                break;
        }
        return "";
    }
}

