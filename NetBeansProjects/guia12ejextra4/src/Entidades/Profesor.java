/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Entidades.Empleado;

/**
 *
 * @author Claudia
 */
public class Profesor extends Empleado {
    protected String departamento;

    // Constructor
    public Profesor(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                    int anioIncorporacion, String numeroDespacho, String departamento) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anioIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    

    // Método para cambiar el departamento de un profesor
    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }
}
