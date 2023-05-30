/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParDeNumerosServicio;

import ParDeNumeros.ParDeNumeros;

/**
 *
 * @author Claudia
 */
public class ParDeNumerosServicio {
    private ParDeNumeros par;
    
    public ParDeNumerosServicio() {
        par = new ParDeNumeros();
    }
    
    public void mostrarValores() {
        System.out.println("Valor 1: " + par.getNumero1());
        System.out.println("Valor 2: " + par.getNumero2());
    }
    
    public double devolverMayor() {
        if (par.getNumero1() > par.getNumero2()) {
            return par.getNumero1();
        } else {
            return par.getNumero2();
        }
    }
    
    public double calcularPotencia() {
        double mayor = devolverMayor();
        double menor = mayor == par.getNumero1() ? par.getNumero2() : par.getNumero1();
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz() {
        double menor = par.getNumero1() < par.getNumero2() ? par.getNumero1() : par.getNumero2();
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
