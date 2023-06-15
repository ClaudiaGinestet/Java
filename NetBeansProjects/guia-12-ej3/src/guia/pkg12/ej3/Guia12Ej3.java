/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg12.ej3;

import java.util.List;

/**
 *
 * @author Claudia
 */
public class Guia12Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear la compañía turística
        CompaniaTuristica compania = new CompaniaTuristica();

        // Agregar alojamientos
        Hotel hotel1 = new HotelCuatroEstrellas("Hotel A", "Dirección A", "Localidad A", "Gerente A",
                                                100, 200, 5, 100.0,
                                                true, "Restaurante A", 40);
        compania.agregarAlojamiento(hotel1);

        Hotel hotel2 = new HotelCincoEstrellas("Hotel B", "Dirección B", "Localidad B", "Gerente B",
                                                200, 400, 10, 200.0,
                                                true, "Restaurante B", 60, 5, 20, 3);
        compania.agregarAlojamiento(hotel2);

        Camping camping1 = new Camping("Camping A", "Dirección C", "Localidad C", "Gerente C",
                                        false, 5000.0, 50, 10, true);
        compania.agregarAlojamiento(camping1);

        Residencia residencia1 = new Residencia("Residencia A", "Dirección D", "Localidad D", "Gerente D",
                                                true, 1000.0, 20, true, false);
        compania.agregarAlojamiento(residencia1);

        // Realizar consultas
        List<Alojamiento> todosAlojamientos = compania.obtenerTodosAlojamientos();
        System.out.println("Todos los alojamientos:");
        todosAlojamientos.forEach((alojamiento) -> {
            System.out.println(alojamiento.getNombre());
        });
        System.out.println();

        List<Hotel> hotelesMasCarosAMasBaratos = compania.obtenerHotelesDeMasCaroAMasBarato();
        System.out.println("Hoteles de más caro a más barato:");
        hotelesMasCarosAMasBaratos.forEach((hotel) -> {
            System.out.println(hotel.getNombre() + " - Precio: $" + hotel.getPrecioHabitaciones());
        });
        System.out.println();

        List<Camping> campingsConRestaurante = compania.obtenerCampingsConRestaurante();
        System.out.println("Campings con restaurante:");
        campingsConRestaurante.forEach((camping) -> {
            System.out.println(camping.getNombre());
        });
        System.out.println();

        List<Residencia> residenciasConDescuento = compania.obtenerResidenciasConDescuento();
        System.out.println("Residencias con descuento:");
        residenciasConDescuento.forEach((residencia) -> {
            System.out.println(residencia.getNombre());
        });
        System.out.println();
    }
}
 