/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extras5;

/**
 *
 * @author Claudia
 */
class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void calcular_aumento() {
        double aumento;
        if (edad > 30) {
            aumento = salario * 0.1;
        } else {
            aumento = salario * 0.05;
        }
        salario += aumento;
        System.out.println("El nuevo salario de " + nombre + " es " + salario);
    }
}   

