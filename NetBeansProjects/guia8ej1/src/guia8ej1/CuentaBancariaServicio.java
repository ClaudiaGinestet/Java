/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Claudia
 */

public class CuentaBancariaServicio {

    private static final Scanner sc = new Scanner(System.in);
    Scanner crearCuenta=new Scanner(System.in);
                                                                                                                                                                                               
    
    
    // Método para crear una cuenta bancaria pidiéndole los datos al usuario
    public static CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = sc.nextInt();
       System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = sc.nextLong();

        System.out.println("Ingrese el saldo actual:");
        double saldoActual = sc.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        }
        
         // Método para ingresar dinero a la cuenta bancaria
    public static void ingresar(CuentaBancaria cuenta, double cantidad) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("Se han ingresado " + cantidad + " pesos en la cuenta.");
    }

    // Método para retirar dinero de la cuenta bancaria
    public static void retirar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        if (cantidad > saldoActual) {
            System.out.println("No se puede retirar la cantidad solicitada, se retirará la cantidad máxima posible.");
            cuenta.setSaldoActual(0);
   } else {
            cuenta.setSaldoActual(saldoActual - cantidad);
            System.out.println("Se han retirado " + cantidad + " pesos de la cuenta.");
        }
    }
     // Método para realizar una extracción rápida (solo el 20% del saldo)
    public static void extraccionRapida(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        double cantidadMaxima = saldoActual * 0.2;
        System.out.println("Se puede retirar hasta " + cantidadMaxima + " pesos.");

        System.out.println("¿Cuánto desea retirar?");
        double cantidad = sc.nextDouble();

        if (cantidad > cantidadMaxima) {
            System.out.println("No se puede retirar la cantidad solicitada, se retirará la cantidad máxima posible.");
            cuenta.setSaldoActual(saldoActual - cantidadMaxima);
        } else {
            cuenta.setSaldoActual(saldoActual - cantidad);
            System.out.println("Se han retirado " + cantidad + " pesos de la cuenta.");
        }
    }
// Método para consultar el saldo actual de la cuenta bancaria
    public static void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo actual de la cuenta es: " + cuenta.getSaldoActual());
    }

 // Método para mostrar todos los datos de la cuenta bancaria
    public static void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Datos de la cuenta:");
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

    private CuentaBancariaServicio() {
    }
}

