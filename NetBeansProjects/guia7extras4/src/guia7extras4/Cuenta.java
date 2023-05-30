/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extras4;

/**
 *
 * @author Claudia
 */
class Cuenta {
  private Double Saldo;
    private String Titular;

    public Cuenta() {
    }

    public Cuenta(Double saldoInicial, String titular) {
        this.Saldo = saldoInicial;
        this.Titular = titular;
    }

    //Geter y Setter
    public Double getSaldo() {
        return Saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setSaldo(Double saldo) {
        this.Saldo = saldo;
    }

    public void setTitular(String titular) {
        this.Titular = titular;
    }

   
    public void sacarPlata(double cantidad) {
        if (cantidad > Saldo) {
            System.out.println("No hay suficiente saldo en la cuenta.");
        } else {
            Saldo = Saldo - cantidad;
            System.out.println("Se ha retirado " + cantidad + " pesos de la cuenta de " + Titular + ".");
        }
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Saldo=" + Saldo + ", Titular=" + Titular + '}';
    }
}  
