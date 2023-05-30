/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
class Punto {
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;
    
    public Punto(){
    };
    
    public Punto(int X1, int Y1, int X2, int Y2){
    }
  
    //Getter y Setter
    public int getX1() {
        return X1;
    }

    public int getY1() {
        return Y1;
    }

    public int getX2() {
        return X2;
    }

    public int getY2() {
        return Y2;
    }

    public void setX1(int X1) {
        this.X1 = X1;
    }

    public void setY1(int Y1) {
        this.Y1 = Y1;
    }

    public void setX2(int X2) {
        this.X2 = X2;
    }

    public void setY2(int Y2) {
        this.Y2 = Y2;
    }

    public void crearPuntos(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor para X1 e Y1: ");
        System.out.println("----------------");
        System.out.println("X1: ");
        X1 = sc.nextInt();
        System.out.println("Y1: ");
        Y1 = sc.nextInt();
        System.out.println(">>>>>><<<<<<");
        System.out.println("Ingrese el valor para X2 e Y2: ");
        System.out.println("----------------");
        System.out.println("X2: ");
        X2 = sc.nextInt();
        System.out.println("Y2: ");
        Y2 = sc.nextInt();
    }
    
    public Double calcularDistancia(){
        int distX = X2 - X1;
        int distY = Y2 - Y1;
        return Math.sqrt(distX*distX + distY*distY);
    }
    
}

