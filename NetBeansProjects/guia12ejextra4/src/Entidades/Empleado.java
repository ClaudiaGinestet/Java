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
public class Empleado extends Persona {
    protected int anioIncorporacion;
    protected String numeroDespacho;

    // Constructor
    public Empleado(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                    int anioIncorporacion, String numeroDespacho) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public String getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(String numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    

    // Método para reasignar el despacho de un empleado
    public void reasignarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

}
