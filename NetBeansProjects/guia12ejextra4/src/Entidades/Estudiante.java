/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Claudia
 */
public class Estudiante extends Persona {
    protected String cursoMatriculado;

    // Constructor
    public Estudiante(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                      String cursoMatriculado) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    

    // Método para matricular a un estudiante en un nuevo curso
    public void matricularEnCurso(String nuevoCurso) {
        this.cursoMatriculado = nuevoCurso;
    }
}
