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
class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;
    
    public Televisor() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }
    
    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public int getResolucion() {
        return resolucion;
    }
    
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    
    public boolean hasSintonizadorTDT() {
        return sintonizadorTDT;
    }
    
    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor() {
        crearElectrodomestico();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la resolución del televisor en pulgadas:");
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        int resolucion = scanner.nextInt();
        setResolucion(resolucion);
        
        System.out.println("¿Tiene sintonizador TDT? (true/false):");
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        boolean sintonizadorTDT = scanner.nextBoolean();
        setSintonizadorTDT(sintonizadorTDT);
        
        scanner.close();
    }
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        // Calcula el precio final según la resolución y el sintonizador TDT del televisor
        // Si la resolución es mayor de 40 pulgadas, aumenta el precio un 30%
        // Si tiene sintonizador TDT incorporado, aumenta $500 al precio
        return precioFinal;
    }
}
