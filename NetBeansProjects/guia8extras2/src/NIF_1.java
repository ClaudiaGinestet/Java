/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia
 */
public class NIF_1{
    private long dni;
    private char letra;
    private static final char[] LETRAS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    public NIF_1(long dni) {
        this.dni = dni;
        this.letra = calcularLetra(dni);
    }
    
    public long getDni() {
        return dni;
    }
    
    public void setDni(long dni) {
        this.dni = dni;
        this.letra = calcularLetra(dni);
    }
    
    public char getLetra() {
        return letra;
    }
    
    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    private char calcularLetra(long dni) {
        int resto = (int)(dni % 23);
        return LETRAS_DNI[resto];
    }
    
    public void mostrar() {
        System.out.printf("%08d-%c", dni, letra).println();
    }
}
