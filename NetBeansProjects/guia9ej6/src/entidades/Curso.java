/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class Curso {
    private String nombreCurso;
    private int cantidadDeHorasPorDia;
    private int cantidadDiasPorSemana;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadDeHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadDeHorasPorDia() {
        return cantidadDeHorasPorDia;
    }

    public void setCantidadDeHorasPorDia(int cantidadDeHorasPorDia) {
        this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    public void cargarAlumnos(){
        Scanner leer=new Scanner(System.in);
        for (int i=0; i<alumnos.length; i++){
            System.out.println("ingrese el nombre del Alumno/a:" + (i+1) + ".");
            alumnos[i]=leer.nextLine();
        }
    }     
    public void crearCurso(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el nombre del Curso:");
        nombreCurso=leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por día del curso mencionado:");
        cantidadDeHorasPorDia=leer.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana del curso");
        cantidadDiasPorSemana=leer.nextInt();
        System.out.println("ingrese el precio por hora del curso");
        precioPorHora=leer.nextDouble();
        
        cargarAlumnos();
       
    }
    public double calcularGananciasSemanales(){
        return cantidadDeHorasPorDia*precioPorHora*alumnos.length*cantidadDiasPorSemana;
        
    }
}
