/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Empleado;

/**
 *
 * @author Claudia
 */
public class PersonalServicio extends Empleado {
    protected String seccionAsignada;

    // Constructor
    public PersonalServicio(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                            int anioIncorporacion, String numeroDespacho, String seccionAsignada) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anioIncorporacion, numeroDespacho);
        this.seccionAsignada = seccionAsignada;
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    // Método para cambiar la sección asignada a un empleado del personal de servicio
    public void cambiarSeccion(String nuevaSeccion) {
        this.seccionAsignada = nuevaSeccion;
    }
}
