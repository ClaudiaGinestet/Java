
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia
 */
public class NIFService {
    public NIF_1 crearNif() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de DNI: ");
        long dni = scanner.nextLong();
        return new NIF_1(dni);
    }
}

