/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
/**
 *
 * @author Claudia
 */


import entidades.Cadena;

public class CadenaServicio {
    private Cadena cad;

    public CadenaServicio(Cadena cadena) {
        this.cad = cadena;
    }

    public int mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < cad.getFrase().length(); i++) {
            char c = Character.toLowerCase(cad.getFrase().charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirFrase() {
        StringBuilder sb = new StringBuilder(cad.getFrase());
        return sb.reverse().toString();
    }

    public int vecesRepetido(String letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (cadena.getFrase().charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        return contador;
    }

    public int compararLongitud(String frase) {
        return cadena.getLongitud() - frase.length();
    }

    public String unirFrases(String frase) {
        return cadena.getFrase() + " " + frase;
    }

    public String reemplazar(String letra, String reemplazo) {
        return cadena.getFrase().replace(letra, reemplazo);
    }

    public boolean contiene(String letra) {
        return cadena.getFrase().contains(letra);
    }
}

