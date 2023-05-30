/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

/**
 *
 * @author Claudia
 */
class CuentaBancaria {
    // Atributos
private int numeroCuenta;
private long dniCliente;
private double saldoActual;

// Constructor vacío
public CuentaBancaria() {
}


// Constructor con parámetros
public CuentaBancaria(int numeroCuenta, long dniCliente, double
saldoActual) {
this.numeroCuenta = numeroCuenta;
this.dniCliente = dniCliente;
this.saldoActual = saldoActual;
}

// Getters y Setters
public int getNumeroCuenta() {
return numeroCuenta;
}

public void setNumeroCuenta(int numeroCuenta) {
this.numeroCuenta = numeroCuenta;
}

public long getDniCliente() {
return dniCliente;
}

public void setDniCliente(long dniCliente) {
this.dniCliente = dniCliente;
}

public double getSaldoActual() {
return saldoActual;
}

public void setSaldoActual(double saldoActual) {
this.saldoActual = saldoActual;
}

@Override
public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta=" + numeroCuenta +
                ", dniCliente=" + dniCliente +
                ", saldoActual=" + saldoActual +
                '}';
    }

}
 

