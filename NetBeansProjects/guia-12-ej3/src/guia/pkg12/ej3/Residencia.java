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
public class Residencia extends AlojamientoExtrahotelero {
    private int cantidadHabitaciones;
    private boolean descuentosGremios;
    private boolean tieneCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados, int cantidadHabitaciones, boolean descuentosGremios, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }


    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public boolean tieneDescuentosGremios() {
        return descuentosGremios;
    }

    public boolean tieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }
}
