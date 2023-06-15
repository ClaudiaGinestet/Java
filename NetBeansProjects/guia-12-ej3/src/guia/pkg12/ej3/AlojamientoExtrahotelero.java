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
class AlojamientoExtrahotelero extends Alojamiento {
    private boolean privado;
    private double metrosCuadrados;

    public AlojamientoExtrahotelero(String nombre, String direccion, String localidad, String gerente,
                                    boolean privado, double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean esPrivado() {
        return privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    @Override
    public double calcularPrecioHabitacion() {
        // Los alojamientos extrahoteleros no tienen precio de habitación
        return 0;
    }
}
