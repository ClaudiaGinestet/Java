/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg12.ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Claudia
 */
class CompaniaTuristica {
    private final List<Alojamiento> alojamientos;

    public CompaniaTuristica() {
        alojamientos = new ArrayList<>();
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {
        alojamientos.add(alojamiento);
    }

    public List<Alojamiento> obtenerTodosAlojamientos() {
        return alojamientos;
    }

    public List<Hotel> obtenerHotelesDeMasCaroAMasBarato() {
        List<Hotel> hoteles = new ArrayList<>();

        alojamientos.stream().filter((alojamiento) -> (alojamiento instanceof Hotel)).forEachOrdered((alojamiento) -> {
            hoteles.add((Hotel) alojamiento);
        });

        Collections.sort(hoteles, (Hotel hotel1, Hotel hotel2) -> Double.compare(hotel2.getPrecioHabitaciones(), hotel1.getPrecioHabitaciones()));

        return hoteles;
    }

    public List<Camping> obtenerCampingsConRestaurante() {
        List<Camping> campings = new ArrayList<>();

        alojamientos.stream().filter((alojamiento) -> (alojamiento instanceof Camping)).map((alojamiento) -> (Camping) alojamiento).filter((camping) -> (camping.tieneRestaurante())).forEachOrdered((camping) -> {
            campings.add(camping);
        });

        return campings;
    }

    public List<Residencia> obtenerResidenciasConDescuento() {
        List<Residencia> residencias = new ArrayList<>();

        alojamientos.stream().filter((alojamiento) -> (alojamiento instanceof Residencia)).map((alojamiento) -> (Residencia) alojamiento).filter((residencia) -> (residencia.tieneDescuentosGremios())).forEachOrdered((residencia) -> {
            residencias.add(residencia);
        });

        return residencias;
    }
}
