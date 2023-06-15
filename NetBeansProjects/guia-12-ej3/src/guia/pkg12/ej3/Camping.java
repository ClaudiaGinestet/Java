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
class Camping extends AlojamientoExtrahotelero {
    private int capacidadMaximaCarpas;
    private int cantidadBanos;
    private boolean tieneRestaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente,
                   boolean privado, double metrosCuadrados, int capacidadMaximaCarpas, int cantidadBanos, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public boolean tieneRestaurante() {
        return tieneRestaurante;
    }
}

