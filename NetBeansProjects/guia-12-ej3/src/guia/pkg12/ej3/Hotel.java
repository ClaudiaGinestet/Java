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
class Hotel extends Alojamiento {
    private int cantidadHabitaciones;
    private int numeroCamas;
    private int cantidadPisos;
    private double precioHabitaciones;

    public Hotel(String nombre, String direccion, String localidad, String gerente,
                 int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    @Override
    public double calcularPrecioHabitacion() {
        return 50 + (1 * cantidadHabitaciones);
    }
}

