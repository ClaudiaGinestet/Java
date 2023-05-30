
import java.util.Scanner;

public class ejercicio2 {
    
    
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
         String salir;
        do {
            System.out.println(mostrardatos());
            System.out.println("Desea agregar más nombres? (Si/No)");
            salir=read.nextLine().toLowerCase();
        } while(salir.equals("si"));
        
    }
    public static String mostrardatos() {
        Scanner read=new Scanner(System.in);
        int edad; String nombre;
        System.out.println("Ingrese Nombre");
        nombre=read.nextLine();
        System.out.println("Ingrese edad");
        edad=read.nextInt();
        if ( edad > 18) {
            System.out.println("La persona "+ nombre +" es mayor de edad con " + edad);
        } else {
            System.out.println("La persona "+ nombre +" no es mayor de edad con " + edad);
        }
        return "";
    }
}
