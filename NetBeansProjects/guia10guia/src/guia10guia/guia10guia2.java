/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10guia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Claudia
 */
public class guia10guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // LISTAS
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        int z = 10;
        int c = 25;
        int v = 33;
        int n = 25;
        numerosA.add(x);
        numerosA.add(z);
        numerosA.add(c);
        numerosA.add(v);
        numerosA.add(n);
        System.out.println("ARRAYLIST - Fueron cargados");
        int cont = 0;
        for(Integer cadena : numerosA){
            cont++;
//            numerosA.remove(Integer.valueOf(33));//borra el objeto
        System.out.print("{ "+cont+" } "+cadena+ " , ");
        }
        System.out.println("");
        System.out.println("#############");
        numerosA.remove(1);//borra el dato del subindice 1
        System.out.println("Fue removido el dato del indice 1");
        System.out.println(numerosA);
        System.out.println("Removemos el objeto o valor");
        numerosA.remove(Integer.valueOf(45));//borra el objeto
        System.out.println(numerosA);
        
        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 30;
        Integer q = 45;
        Integer w = 789;
        Integer r = 124;
        Integer o = 45;
        
        numerosB.add(y);
        numerosB.add(q);
        numerosB.add(w);
        numerosB.add(r);
        numerosB.add(o);
        System.out.println("CONJUNTOS - Fueron cargados");
        System.out.println(numerosB);
        numerosB.remove(45);
        System.out.println("Fue removido el objeto 45");
        System.out.println(numerosB);
        
        //MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        
        int dni = 21302230;
        String nombre = "Daniel";
        
        int dni1 = 23458788;
        String nombre1 = "Juana";
        
        int dni2 = 45786233;
        String nombre2 = "Hugo";
        
        int dni3 = 32458652;
        String nombre3 = "Laura";
        
        alumnos.put(dni, nombre);
        alumnos.put(dni1, nombre1);
        alumnos.put(dni2, nombre2);
        alumnos.put(dni3, nombre3);
        System.out.println("MAPAS - Fueron cargados");
        System.out.println(alumnos);
        System.out.println("Fue removido el dni2 de Hugo");
        alumnos.remove(45786233);
        System.out.println(alumnos);
    }
   
}
