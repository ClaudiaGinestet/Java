
import Servicio.ArregloService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia
 */
public class MainArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[]arregloA = new double[50];
        double[]arregloB = new double[20];
        
        //inicializar A y mostrar A
        ArregloService.inicializarA(arregloA);
        System.out.println("arreglo A inicializado:");
        ArregloService.mostrar(arregloA);
        
        //ordenar A y mostrar A
        ArregloService.ordenar(arregloA);
        System.out.println("Arrreglo A ordenado de mayor a menor.");
        ArregloService.mostrar(arregloA);
        
        //inicializar B y mostrar A y B
        ArregloService.inicializarB(arregloA,arregloB);
        System.out.println("Arreglo B inicializado con los primeros 10 elementos de A y 10 elementos de 0.5.");
        ArregloService.mostrar(arregloB);
        
        //mostrar A de nuevo para verificaar que no haya cambiado
        System.out.println("Arrreglo A sin cambios.");
        ArregloService.mostrar(arregloA);
    }
    
    
}
