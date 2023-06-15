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
class HotelCuatroEstrellas extends Hotel {
    private boolean gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;

    public HotelCuatroEstrellas(String nombre, String direccion, String localidad, String gerente,
                                int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones,
                                boolean gimnasio, String nombreRestaurante, int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public boolean tieneGimnasio() {
        return gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    @Override
    public double calcularPrecioHabitacion() {
        double precioBase = super.calcularPrecioHabitacion();
        double valorAgregadoRestaurante;

        if (capacidadRestaurante < 30) {
            valorAgregadoRestaurante = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valorAgregadoRestaurante = 30;
        } else {
            valorAgregadoRestaurante = 50;
        }

        return precioBase + valorAgregadoRestaurante;
    }
}
