/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class FechaServicio {
    //metodo que pide al usuario su fecha de nacimiento y retorna un objeto DATE con esa fecha
    public static Date fechaNacimiento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Dia:");
        int dia = leer.nextInt();
        System.out.print("Mes:");
        int mes = leer.nextInt()-1; //el mes es un numero ente 0 y 11, entonces hay que restarle uno al ingresado por el usuario
        System.out.print("Año:");
        int year = leer.nextInt();
        Date fecha=new Date(year,mes,dia);
        return fecha;
    }
    //metodo que retorna la fecha actual del sistema
    public static Date fechaActual(){
        Date fecha = new Date(); //esto es la creacion de un objeto con el const vacio, sto nos da la fecha actual del sistema.
        return fecha;
    }
    
    //metodo que calcula la dif entre las fecha y te dice la edad
    public static int edad(Date fechaNacimiento, Date fechaActual){
        long milisegundosPorAnio=1000L*60L*60*24L*365L; //hay que usar una convencion para pasar las fecha a un valor para operar
        long difEnMili=fechaActual.getTime()-fechaNacimiento.getTime();//la resta en milisegundos 
        int difEnAnios= (int)(difEnMili/milisegundosPorAnio);//Conversion de mili a ayos
        return difEnAnios;
    }
}
