
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
public class NewClass {
  Scanner leer = new Scanner(System.in);
       int num1;
       int num2;
        System.out.println("ingrese un numero");
        num1= leer.nextInt();
        System.out.println("ingrese otro numero");
       num2= leer.nextInt();
        int suma;
        suma= num1+num2;
        System.out.println("La suma es: "+ num1 + "+" + num2 + "=" +suma);  
}
