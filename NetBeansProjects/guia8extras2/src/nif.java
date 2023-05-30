/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia
 */
public class nif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    NIFService nifService = new NIFService();
    NIF_1 nif = nifService.crearNif();
    nif.mostrar();
}
}
