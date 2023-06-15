/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg12.ej3;

/**
 *
 * @author Claudia
 */
public abstract class Alojamiento {
    private String nombre;
    private String direccion;
    private String localidad;
    private String gerente;

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getGerente() {
        return gerente;
    }

    // Método abstracto para calcular el precio de la habitación
    public abstract double calcularPrecioHabitacion();
}
