/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extras6;

/**
 *
 * @author Claudia
 */
class Rectangulo {
    // Atributos de la clase Rectangulo
    private int lado1;
    private int lado2;
    
    // Constructor de la clase Rectangulo que inicializa los atributos lado1 y lado2
    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    // Método que calcula y devuelve el área del rectángulo
    public int calcular_area() {
        return lado1 * lado2;
    }
}
