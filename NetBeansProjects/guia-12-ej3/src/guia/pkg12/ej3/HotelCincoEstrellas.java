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
class HotelCincoEstrellas extends Hotel {
    private boolean gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private int cantidadSalonesConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public HotelCincoEstrellas(String nombre, String direccion, String localidad, String gerente,
                               int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones,
                               boolean gimnasio, String nombreRestaurante, int capacidadRestaurante,
                               int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
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

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
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

        double valorAgregadoGimnasio = gimnasio ? 50 : 30;
        double valorAgregadoLimosinas = 15 * cantidadLimosinas;

        return precioBase + valorAgregadoRestaurante + valorAgregadoGimnasio + valorAgregadoLimosinas;
    }
}

