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
class Lavadora extends Electrodomestico {
    private double carga;
    
    public Lavadora() {
        super();
        this.carga = 5;
    }
    
    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    public double getCarga() {
        return carga;
    }
    
    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora() {
        crearElectrodomestico();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la carga de la lavadora:");
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        double carga = scanner.nextDouble();
        setCarga(carga);
        
        scanner.close();
    }
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        // Calcula el precio final según la carga de la lavadora
        // Si la carga es mayor de 30 kg, aumenta el precio en $500
        return precioFinal;
    }
}
