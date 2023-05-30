/*
Crea una aplicación que nos pida un número por teclado y con una función se lo 
pasamos por parámetro para que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package guia.pkg4;

import java.util.Scanner;


public class Guia4{

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int num1;
        System.out.println("Ingrse un numero");
        num1=read.nextInt();
        if (esPrimo(num1)){
            System.out.println("El numero "+num1+" es primo");
        }else{
            System.out.println("El numero "+num1+" no es primo");
        }
    }
    public static boolean esPrimo (int num1){
 
      
        if (num1<=1){
            return false;
        }
 
       
        int cont=0;
        for (int divisor=(int)Math.sqrt(num1);divisor>1;divisor--){
       
                if (num1%divisor==0){
                cont+=1;
            }
        }
        
        if (cont>=1){
            return false;
        }else{
            return true;
        }
    }
}
