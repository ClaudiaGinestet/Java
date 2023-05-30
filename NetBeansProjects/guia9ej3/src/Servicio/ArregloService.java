/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Claudia
 */
public class ArregloService {

    private static Random random = new Random();

    private ArregloService() {
    }

    //punto1
    public static void inicializarA(double[] arreglo) {
        for (int i=0; i<arreglo.length; i++) {
            arreglo[i] = random.nextDouble() * 100; //genera num aleatorios entre 0 y 100
        }
    }

    //punto2
   public static void mostrar(double[]arreglo){
       System.out.println(Arrays.toString(arreglo));
   }
   
   //punto3
  public static void ordenar (double[]arreglo){
      Arrays.sort(arreglo);
      for(int i=0; i<arreglo.length/2; i++){
      double temp=arreglo[i];
      arreglo[i]=arreglo[arreglo.length -i-1];
      arreglo[arreglo.length -i -1] = temp;   
      }
  }
    //invierte el orden del arreglo para que quede de mayor a menor
    
    //punto4
     public static void inicializarB(double[] arregloA, double[] arregloB){
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
           //for(int i=0;i<10;i++){
           //arregloB[i]=arregloa[i];
         for (int i=10;i<arregloB.length;i++){
            arregloB[i] = 0.5;
        } 
     }
     
  }
       
  

