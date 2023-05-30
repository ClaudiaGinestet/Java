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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        CuentaBancaria cuenta = CuentaBancariaServicio.crearCuenta();

        CuentaBancariaServicio.ingresar(cuenta, 1000);
        CuentaBancariaServicio.retirar(cuenta, 500);
        CuentaBancariaServicio.extraccionRapida(cuenta);
        CuentaBancariaServicio.consultarSaldo(cuenta);
        CuentaBancariaServicio.consultarDatos(cuenta);
    }
}

