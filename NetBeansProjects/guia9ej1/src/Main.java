/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import entidades.Cadena;
import servicios.CadenaServicio;
/**
 *
 * @author Claudia
 */



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        Cadena cadena = new Cadena(frase);
        CadenaServicio servicio = new CadenaServicio(cadena);
        System.out.println("La frase contiene " + servicio.mostrarVocales() + " vocales");

        String fraseInvertida = servicio.invertirFrase();
        System.out.println("La frase invertida es: " + fraseInvertida);

        String letra = "o";
        int vecesRepetido = servicio.vecesRepetido(letra);
        System.out.println("La letra '" + letra + "' se repite " + vecesRepetido + " veces");

        String otraFrase = "Hola a todos";
        int comparacion = servicio.compararLongitud(otraFrase);
        if (comparacion > 0) {
            System.out.println("La frase original es más larga que la nueva frase");
        } else if (comparacion < 0) {
            System.out.println("La nueva frase es más larga que la frase original");
        } else {
            System.out.println("Las dos frases tienen la misma longitud");
        }

        String union = servicio.unirFrases("¿Cómo estás?");
        System.out.println("La frase resultante es: " + union);

        String reemplazo = servicio.reemplazar("o", "x");
        System.out.println("La frase resultante es: " + reemplazo);

        String letraBuscada = "u";
        boolean contieneLetra = servicio.contiene(letraBuscada);
        if (contieneLetra) {
            System.out.println("La frase contiene la letra '" + letraBuscada + "'");
        } else {
            System.out.println("La frase no contiene la letra '" + letraBuscada + "'");
        }
    }
}
