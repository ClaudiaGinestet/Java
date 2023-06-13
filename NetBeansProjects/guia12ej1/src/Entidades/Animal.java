/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Claudia
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;
    
    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void Alimentarse() {
        System.out.println(nombre + " se alimenta de " + alimento);
    }
}

    