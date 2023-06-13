/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ej2;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class Electrodomestico {
 
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 1;
    }
    
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = comprobarColor(color);
    }
    
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }
    
    private String comprobarColor(String color) {
        String colorLower = color.toLowerCase();
        if (colorLower.equals("blanco") || colorLower.equals("negro") || colorLower.equals("rojo") ||
                colorLower.equals("azul") || colorLower.equals("gris")) {
            return colorLower;
        } else {
            return "blanco";
        }
    }
    
    public void crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el color del electrodoméstico:");
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String color = scanner.nextLine();
        setColor(color);
        
        System.out.println("Ingrese el consumo energético (letra entre A y F):");
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        char consumoEnergetico = scanner.next().charAt(0);
        setConsumoEnergetico(consumoEnergetico);
        
        System.out.println("Ingrese el peso del electrodoméstico:");
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        double peso = scanner.nextDouble();
        setPeso(peso);
        
        scanner.close();
    }
    
    public double precioFinal() {
        double precioFinal = precio;
        // Calcula el precio final según el consumo energético y el peso
        // Utiliza las listas de precios proporcionadas en el enunciado
        return precioFinal;
    }
}
   
