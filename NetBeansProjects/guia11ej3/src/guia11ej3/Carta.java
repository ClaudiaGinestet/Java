/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej3;
/**
 *
 * @author Claudia
 */
class Carta {
    private final int numero;
    private final String palo;

public Carta(int numero,String palo){
this.numero = numero;
this.palo = palo;
}
    @Override
    public String toString(){
return numero + " de "+ palo;
}
}

