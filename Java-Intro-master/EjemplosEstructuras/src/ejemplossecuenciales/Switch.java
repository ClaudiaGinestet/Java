package ejemplossecuenciales;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        // Nos interesa que el usuario ingrese un numero y muestre el
        // equivalente en numero romano
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String palabra = null;
        palabra = leer.next(palabra);

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

}
